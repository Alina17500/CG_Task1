package ru.vsu.cs.volobueva;

import java.awt.*;

public class Iceberg {
    int x, y;

    public Iceberg(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(79, 148, 205));
        int[] arrayX = {this.x + 480, this.x + 510, this.x + 540, this.x + 550,this.x + 560, this.x + 580, this.x + 620,
                this.x + 670, this.x + 710, this.x + 730, this.x + 740, this.x + 770};
        int[] arrayY = {this.y + 50, this.y, this.y - 30, this.y - 70, this.y - 110, this.y - 150, this.y - 140,
                this.y - 90, this.y - 60, this.y - 30, this.y, this.y + 50};
        g.fillPolygon(arrayX, arrayY, 12);
    }
}
