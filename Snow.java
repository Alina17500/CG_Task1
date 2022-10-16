package ru.vsu.cs.volobueva;

import java.awt.*;
import java.util.Random;

public class Snow {
    private static final Random random = new Random();
    private int x;
    private int y;
    private Color color;

    public Snow(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.color);
        g.setStroke(new BasicStroke(2));
        g.drawLine(this.x, this.y, this.x + random.nextInt(10), this.y);
    }
}
