/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cobagui;

/**
 *
 * @author LENOVO
 */

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CobaGui {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Change Button Color On Press");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Press me!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aksi yang ingin Anda lakukan saat tombol ditekan
                JOptionPane.showMessageDialog(frame, "Button Pressed!");
            }
        });

        // Menggunakan UIManager untuk mengatur properti tombol
        UIManager.put("Button.select", new ColorUIResource(Color.RED));

        // Mengatur tombol sebagai default button pada RootPane
        frame.getRootPane().setDefaultButton(button);

        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(button);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
