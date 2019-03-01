package Graficos;

import Control.DriverTeclado;

import javax.swing.*;

import static Logica.Juego.f1;

public class Ventana extends JFrame{

    public Ventana() {
        this.setBounds(0, 0, 450, 675);
        this.setTitle("Galaga 2019");
        this.add(f1);
        DriverTeclado eventoT = new DriverTeclado();
        addKeyListener(eventoT);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("../Recursos/icon/nave.jpg")).getImage());
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }
}
