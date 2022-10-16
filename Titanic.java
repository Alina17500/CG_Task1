package ru.vsu.cs.volobueva;

import java.awt.*;

public class Titanic {
    int x,y;
    public Titanic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void draw(Graphics2D g){
        //корпус
        drawCorpus(g, this.x, this.y);

        //белый бортик над корпусом
        drawSide(g, this.x, this.y);

        //первый (нижний) корпус
        drawLowerCase(g, this.x, this.y);

        //второй (верхний) корпус
        drawUpperCase(g, this.x, this.y);

        //труба1
        drawPipe(g, this.x, this.y);

        //труба2
        drawPipe(g, this.x - 55, this.y + 7);

        //труба3
        drawPipe(g, this.x - 110, this.y + 14);

        //Штатив 1
        drawFrontTripod(g, this.x, this.y);

        //Штатив 2
        drawRearTripod(g, this.x, this.y);

        //окна основного корпуса
        drawWindowLine1(g, this.x + 30, this.y + 5);
        drawWindowLine2(g, this.x + 40, this.y + 25);

        //окна нижнего корпуса
        drawWindowLowCorpus(g, this.x + 50, this.y - 30);

        //окна верхнего корпуса
        drawWindowHighCorpus(g, this.x + 50, this.y - 54);

        //текст
        drawText(g, this.x, this.y);
    }

    private static void drawCorpus(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        int[] arrayX = {x, x, x + 30, x + 370, x + 378};
        int[] arrayY = {y, y + 10, y + 50, y + 50, y - 40};
        g.fillPolygon(arrayX, arrayY, 5);
    }

    private static void drawSide(Graphics g, int x, int y) {
        g.setColor(new Color(235,140,76));
        int[] arrayX = {x, x, x + 380, x + 378};
        int[] arrayY = {y, y - 10, y - 50, y - 40};
        g.fillPolygon(arrayX, arrayY, 4);
    }

    private static void drawLowerCase(Graphics g, int x, int y) {
        g.setColor(new Color(49, 89, 83));
        int[] arrayX = {x + 40, x + 40, x + 290, x + 290};
        int[] arrayY = {y - 14, y - 40, y - 70, y - 41};
        g.fillPolygon(arrayX, arrayY, 4);
    }

    private static void drawUpperCase(Graphics g, int x, int y) {
        g.setColor(new Color(75, 131, 122));
        int[] arrayX = {x + 40, x + 40, x + 280, x + 280};
        int[] arrayY = {y - 40, y - 60, y - 90, y - 69};
        g.fillPolygon(arrayX, arrayY, 4);
    }

    private static void drawFrontTripod(Graphics g, int x, int y) {
        //Штатив 1
        g.setColor(new Color(87, 55, 3));
        int[] arrayX = {x + 320, x + 323, x + 325, x + 330}; //340, 343, 345, 350
        int[] arrayY = {y - 44, y - 240, y - 240, y - 45}; //206, 10, 10, 205
        g.fillPolygon(arrayX, arrayY, 4);
        //линии справа
        g.drawLine(x + 325, y - 225, x + 379, y - 50); //большая 345, 25
        g.drawLine(x + 326, y - 158, x + 360, y - 48); //средняя 346,..,380,202
        g.drawLine(x + 326, y - 100, x + 345, y - 46); //маленькая 346, 150, 365, 204
        //линии слева
        g.drawLine(x + 325, y - 227, x + 270, y - 89);//б 345, 23
        g.drawLine(x + 322, y - 155, x + 290, y - 70);//ср
        g.drawLine(x + 322, y - 95, x + 305, y - 42);//м 342, 155, 325, 208
    }

    private static void drawRearTripod(Graphics g, int x, int y) {
        //Штатив 2
        g.setColor(new Color(87, 55, 3));
        g.fillRect(x + 70, y - 183, 2, 120); //90, 67, 2, 120
        //линии слева
        g.drawLine(x + 20, y - 12, x + 70, y - 165);//б 40, 238, 90, 85
        g.drawLine(x + 50, y - 61, x + 70, y - 125);//ср 70, 189, 90, 125
        //линии справа
        g.drawLine(x + 115, y - 69, x + 70, y - 170);//б 135, 181, 90, 80
        g.drawLine(x + 90, y - 66, x + 70, y - 130);//ср 110, 184, 90, 120
    }

    private static void drawWindowLine1(Graphics g, int x, int y) {
        g.setColor(Color.ORANGE);
        //y = -i*7/64 + 260
        for (int i = x; i < x + 280; i+=20) {
            g.fillOval(i, y, 10, 10);
            y --;
        }
    }

    private static void drawWindowLine2(Graphics g, int x, int y) {
        g.setColor(Color.ORANGE);
        //y = -i*5/62 + 280;
        for (int i = x; i < x + 310; i+=20) {
            g.fillOval(i, y, 10, 10);
            y--;
        }
    }

    private static void drawWindowLowCorpus(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        //y = -i*5/44 + 228;
        for (int i = x; i < x + 220; i+=15) {
            g.fillRect(i, y, 5, 8);
            y-=2;
        }
    }

    private static void drawWindowHighCorpus(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        //y = -i*7/55 + 205;
        for (int i = x; i < x + 220; i+=15) {
            g.fillRect(i, y, 5, 8);
            y-=2;
        }
    }

    private static void drawPipe(Graphics g, int x, int y) {
        g.setColor(new Color(94, 63, 5));
        int[] arrayX = {x + 225, x + 225, x + 265, x + 265}; //245, 245, 285, 285
        int[] arrayY = {y - 83, y - 153, y - 158, y - 88}; //167, 97, 92, 162
        g.fillPolygon(arrayX, arrayY, 4);
        g.setColor(Color.BLACK);
        int[] arrayX1 = {x + 225, x + 225, x + 265, x + 265};
        int[] arrayY1 = {y - 153, y - 183, y - 184, y - 158};
        g.fillPolygon(arrayX1, arrayY1, 4);
        g.fillOval(x + 225, y - 190, 40, 15); //245, 60, 40, 15
    }

    private static void drawText(Graphics g, int x, int y) {
        g.setColor(Color.WHITE);
        Font font = new Font("TimesRoman", Font.BOLD, 12);
        g.setFont(font);
        g.drawString("T I T A N I C", x + 305, y - 10);
    }
}
