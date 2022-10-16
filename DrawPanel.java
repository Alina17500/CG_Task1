package ru.vsu.cs.volobueva;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DrawPanel extends JPanel implements ActionListener  {
    private static final Random random = new Random();
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;
    private int i = 0;
    private int j = 255;
    private final Snow snow;
    private final Sun sun;
    private final Titanic titanic;
    private final Iceberg iceberg;
    private final Sky sky;
    private final Ocean ocean;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.snow = new Snow(PANEL_WIDTH, PANEL_HEIGHT, new Color(124,182,196));
        this.sun = new Sun(140, ticksFromStart, 50, 30, 15);
        this.titanic = new Titanic(ticksFromStart, 350);
        this.iceberg = new Iceberg(20, 350);
        this.sky = new Sky(0, 0, PANEL_WIDTH, PANEL_HEIGHT);
        this.ocean = new Ocean(0, PANEL_WIDTH, PANEL_HEIGHT);
    }


    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        Graphics2D g2d = (Graphics2D) gr;

        sky.draw(g2d, new Color(255 - i, 255 - i, 255 - i));

        sun.setY(ticksFromStart + 180);
        sun.draw(g2d, new Color(255,j,0));

        ocean.draw(g2d, new Color(0, 0, 205));

        iceberg.draw(g2d);

        titanic.setX(ticksFromStart);
        titanic.draw(g2d);

        for (int value = 0; value < i; value++) {
            snow.setX(random.nextInt(PANEL_WIDTH));
            snow.setY(random.nextInt(PANEL_HEIGHT));
            snow.draw(gr);
        }

        if (ticksFromStart > 260) {
            g2d.setColor(Color.BLACK);
            g2d.fillRect(0, 0, PANEL_WIDTH, PANEL_HEIGHT);
            g2d.setColor(Color.CYAN);
            Font font = new Font("Arial", Font.ITALIC, 20);
            g2d.setFont(font);
            g2d.drawString("В течение последующих 4х часов тонул ожидающий помощи Титаник.", 10, 230);
            g2d.drawString("1500 человек из 2200 пассажиров Титаника погибли в течение этого времени.", 10, 250);
            g2d.drawString("Все эти люди - жертвы человеческой алчности, эгоизма и жажды славы.", 10, 270);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
            if(i < 225) {i+=1;}
            if(j > 0) {j-=1;}
        }
    }
}
