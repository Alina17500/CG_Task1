package ru.vsu.cs.volobueva;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MainWindow window = new MainWindow(800, 600);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        window.setSize(800, 600);
        window.setVisible(true);
    }
}
