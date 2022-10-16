package ru.vsu.cs.volobueva;

import java.awt.*;

public class Sky {
    private int x;
    private int y;
    private int width;
    private int height;

    public Sky(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    public void draw(Graphics g, Color color) {
        g.setColor(color);
        g.fillRect(this.x, this.y, this.width, 3*this.height/5);
    }
}
