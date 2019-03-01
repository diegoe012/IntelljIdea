package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Acerca extends JFrame {
    public Acerca(){
        this.setTitle("Acerca de...");
        this.setSize(500,360);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(39,47,77));

        JLabel title = new JLabel("Galaga UD 2019");
        title.setBounds(300,40,200,25);
        title.setFont(new Font("Segoe UI",0,18));
        title.setForeground(Color.white);
        this.add(title);

        JLabel version = new JLabel("Versión: 1.11");
        version.setBounds(300,75,200,25);
        version.setFont(new Font("Segoe UI",0,15));
        version.setForeground(Color.white);
        this.add(version);

        JLabel standar = new JLabel("Java Standar 8");
        standar.setBounds(300,95,200,25);
        standar.setFont(new Font("Segoe UI",0,15));
        standar.setForeground(Color.white);
        this.add(standar);

        JLabel name1 = new JLabel("Santiago Hernandez");
        name1.setBounds(300,115,200,25);
        name1.setFont(new Font("Segoe UI",0,15));
        name1.setForeground(Color.white);
        this.add(name1);

        JLabel name2 = new JLabel("Diego Molina");
        name2.setBounds(300,135,200,25);
        name2.setFont(new Font("Segoe UI",0,15));
        name2.setForeground(Color.white);
        this.add(name2);

        JLabel University = new JLabel("Universidad Distrital");
        University.setBounds(300,155,200,25);
        University.setFont(new Font("Segoe Ui",0,15));
        University.setForeground(Color.white);
        this.add(University);

        JLabel Proyecto = new JLabel("Proyecto Final Poo");
        Proyecto.setBounds(300,175,200,25);
        Proyecto.setFont(new Font("Segoe UI",0,15));
        Proyecto.setForeground(Color.white);
        this.add(Proyecto);

        JButton volver = new JButton("Volver");
        volver.setBounds(180,220,150,50);
        volver.setFont(new Font("A-Space Light Demo",4,30));
        volver.setOpaque(false);
        volver.setBorder(null);
        volver.setFocusPainted(false);
        volver.setForeground(Color.WHITE);
        volver.setBackground(new Color(0,0,0,0));
        this.add(volver);


        volver.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Menu m1 = new Menu();
            }
        });

        fondoAcerca a1 = new fondoAcerca();
        this.add(a1);


        this.setIconImage(new ImageIcon(getClass().getResource("../Recursos/icon/nave.jpg")).getImage());
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }
}
