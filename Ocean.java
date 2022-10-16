package ru.vsu.cs.volobueva;

import java.awt.*;

public class Ocean {
    private int x;
    private int width;
    private int height;

    public Ocean(int x, int width, int height) {
        this.x = x;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g, Color color) {
        g.setColor(color);
        g.fillRect(this.x, 3*height/5, this.width, 2*this.height/5);
    }
}
