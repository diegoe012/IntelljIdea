package Logica;

import Graficos.Fondo;
import Graficos.Menu;
import Graficos.Ventana;


public class Juego {

    public static int numberScore = 0;
    public static int numberMaxScore = 3000;
    public static int leve =0;

    public static Nave n1 = new Nave();
    public static Life l1 = new Life();
    public static Fondo f1 = new Fondo();

     public static Alien a1 = new Alien();

    public static void main(String []args) throws InterruptedException {
        Menu m1 = new Menu();
    }

}
