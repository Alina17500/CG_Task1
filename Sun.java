package ru.vsu.cs.volobueva;

import java.awt.*;

public class Sun {
    private int x, y, radius, l, n;

    public Sun(int x, int y, int radius, int l, int n) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.l = l;
        this.n = n;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(Graphics2D g, Color color) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2*radius, 2*radius);
        double da = 2*Math.PI/n;
        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = radius * Math.cos(a) + x;
            double y1 = radius * Math.sin(a) + y;
            double x2 = (radius + l) * Math.cos(a) + x;
            double y2 = (radius + l) * Math.sin(a) + y;
            g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
        }
    }
}
