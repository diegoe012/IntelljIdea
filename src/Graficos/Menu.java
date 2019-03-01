package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

    public static String user;
    public static boolean seleccion;


    public Menu(){
        this.setTitle("Menú Galaga");
        this.setSize(640,480);

        JButton play = new JButton("Play");
        play.setBounds(270,350,100,50);
        play.setFont(new Font("A-Space Light Demo",4,30));
        play.setOpaque(false);
        play.setBorder(null);
        play.setFocusPainted(false);
        play.setForeground(Color.WHITE);
        play.setBackground(new Color(0,0,0,0));
        this.add(play);

        play.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new ImageIcon(getClass().getResource("../Recursos/icon/nave.jpg")).getImage();
                user = JOptionPane.showInputDialog(null, "Enter your name", "Login", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Thanks");

                Ventana v1 = new Ventana();
                setVisible(false);

            }
        });

        JButton help = new JButton("About");
        help.setBounds(70,350,150,50);
        help.setFont(new Font("A-Space Light Demo",4,30));
        help.setOpaque(false);
        help.setBorder(null);
        help.setFocusPainted(false);
        help.setForeground(Color.WHITE);
        help.setBackground(new Color(0,0,0,0));
        this.add(help);


        help.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Acerca ac1 = new Acerca();
                setVisible(false);
            }
        });

        JButton exit = new JButton("Exit");
        exit.setBounds(400,350,150,50);
        exit.setFont(new Font("A-Space Light Demo",4,30));
        exit.setOpaque(false);
        exit.setBorder(null);
        exit.setFocusPainted(false);
        exit.setForeground(Color.WHITE);
        exit.setBackground(new Color(0,0,0,0));
        this.add(exit);

        exit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
                dispose();
            }
        });

        fondoMenu fondoMenu = new fondoMenu();
        this.add(fondoMenu);
        this.setVisible(true);
        this.setIconImage(new ImageIcon(getClass().getResource("../Recursos/icon/nave.jpg")).getImage());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
    }


}

