package com.example.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("sansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The first time using Frame in java", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("The small font", 60, 100);


    }

    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });

    }
}
