/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
/**
 *
 * @author milindsharma
 */
import java.awt.Color;
import java.awt.Label;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.geom.RoundRectangle2D;

import javax.swing.*;

public class Toast extends JDialog {

    private static final long serialVersionUID = 1L;
    private static Boolean spamProtect = false;
    private final int milliseconds = 2500;

    public Toast(JComponent caller, String toastString, boolean success) {
        if(spamProtect) {
            return;
        }
        
        Color color;
        
        if (success) {
            color = new Color(0, 200 , 0);
        } else {
            color = new Color(200, 0 , 0);
        }
        
        setUndecorated(true);
        setAlwaysOnTop(true);
        setFocusableWindowState(false);
        setLayout(new GridBagLayout());

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        panel.setBackground(color);
        JLabel toastLabel = new JLabel(toastString);
        toastLabel.setForeground(Color.WHITE);
        panel.add(toastLabel);
        add(panel);
        pack();

        Window window = SwingUtilities.getWindowAncestor(caller);
        int xcoord = window.getLocationOnScreen().x + window.getWidth() / 2 - getWidth() / 2 + 100;
        int ycoord = window.getLocationOnScreen().y + (int)((double)window.getHeight() * 0.75) - getHeight() / 2;
        setLocation(xcoord, ycoord);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10));
        setVisible(true);

        new Thread(){
            public void run() {
                try {
                    spamProtect = true;
                    Thread.sleep(milliseconds);
                    dispose();
                    spamProtect = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    
}