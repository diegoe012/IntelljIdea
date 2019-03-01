package Control;

import Logica.Nave;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static Logica.Juego.*;

public class DriverTeclado implements KeyListener{

    public DriverTeclado(){

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == 39 ){
            if(Nave.getX() < 360)
                n1.mover(10);
        }
        if (e.getKeyCode() == 37){
            if(Nave.getX() > 0)
                 n1.mover(-10);
        }
        if(e.getKeyCode() == 38 || e.getKeyCode() == 32 ){
                n1.disparar();
                leve=leve+1;
                f1.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
