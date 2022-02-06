package com.invertedowl;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz Game!");
        frame.setSize(600, 600);
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(screenSize.width/2 - 500, 50);
        Canvas canvas = new Canvas();
        frame.setResizable(false);
        canvas.setSize(600, 600);
        frame.add(canvas);
        canvas.paint(frame.getGraphics());
        frame.addMouseListener(canvas);
    }
}
