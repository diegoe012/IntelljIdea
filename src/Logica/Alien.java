package Logica;

import Graficos.Fondo;

import javax.swing.*;
import java.awt.*;

public class Alien {

    private static String alien;
    private static int dy;
    private static int dx;
    private static int x;
    private static int y;
    private static int tamaño;
    private static Image ImagenAlien;

    int xa = 1;
    int ya = 1;
    private Fondo game;
    private static final int WITH = 50;
    private static final int HEIGHT = 50;

    public Alien(){
        x = 10;
        y = 50;
        tamaño = 50;
        alien = "../Recursos/spriteAlien/1.png";
        ImageIcon imgAlien = new ImageIcon(this.getClass().getResource(alien));
        ImagenAlien = imgAlien.getImage();
    }

    public void move() {
        if (x + xa < 0)
            xa = 1;
        if (x + xa > game.getWidth() - WITH)
            xa = -1;
        if (y + ya < 0)
            ya = 1;
        if (y + ya > game.getHeight() - HEIGHT)
            ya = -1;
        /*if (collision()){
            game.gameOver();
        }*/
        x = x + xa;
        y = y + ya;
    }

    public static int getDy() {
        return dy;
    }

    public static int getDx() {
        return dx;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getTamaño() {
        return tamaño;
    }

    public static Image getImagenAlien() {
        return ImagenAlien;
    }

    public static String getAlien() {
        return alien;
    }

    public static void setAlien(String alien) {
        Alien.alien = alien;
    }

    public static void setDy(int dy) {
        Alien.dy = dy;
    }

    public static void setDx(int dx) {
        Alien.dx = dx;
    }

    public static void setX(int x) {
        Alien.x = x;
    }

    public static void setY(int y) {
        Alien.y = y;
    }

    public static void setTamaño(int tamaño) {
        Alien.tamaño = tamaño;
    }

    public static void setImagenAlien(Image imagenAlien) {
        ImagenAlien = imagenAlien;
    }

    public int getXa() {
        return xa;
    }

    public void setXa(int xa) {
        this.xa = xa;
    }

    public int getYa() {
        return ya;
    }

    public void setYa(int ya) {
        this.ya = ya;
    }

    public Fondo getGame() {
        return game;
    }

    public void setGame(Fondo game) {
        this.game = game;
    }

    public static int getWITH() {
        return WITH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }
}
