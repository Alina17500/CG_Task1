package ru.vsu.cs.volobueva;

import javax.swing.*;
import java.awt.*;

public class MainWindow  extends JFrame {
    private DrawPanel dp;

    public MainWindow(int width, int height) throws HeadlessException {
        this.setSize(width, height);
        dp = new DrawPanel(width, height,100);
        this.add(dp);
    }
}
