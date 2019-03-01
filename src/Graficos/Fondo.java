package Graficos;

import Logica.Alien;
import Logica.Bala;
import Logica.Life;
import Logica.Nave;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

import static Logica.Juego.*;

public class Fondo extends JPanel{
    private URL url = getClass().getResource("../Recursos/fondo/animateFondo.gif");
    Image fondo = new ImageIcon(url).getImage();


    public Fondo(){
        setLayout(null);

        JLabel User = new JLabel("USER");
        User.setBounds(7,5,200,25);
        User.setFont(new Font("Segoe Ui",0,20));
        User.setForeground(Color.white);
        this.add(User);


        JLabel User2 = new JLabel(Menu.user);
        User2.setBounds(7,25,200,25);
        User2.setFont(new Font("Segoi Ui",0,15));
        User2.setForeground(new Color(255,255,255));
        this.add(User2);

        JLabel maxScore = new JLabel("HIGH SCORE");
        maxScore.setBounds(165,5,200,25);
        maxScore.setFont(new Font("Segoe Ui",0,20));
        maxScore.setForeground(Color.white);
        this.add(maxScore);

        JLabel MaxScore = new JLabel(Integer.toString(numberMaxScore));
        MaxScore.setBounds(200,25,200,25);
        MaxScore.setFont(new Font("Segoe Ui",0,20));
        MaxScore.setForeground(Color.white);
        this.add(MaxScore);


        JLabel Score = new JLabel("SCORE");
        Score.setBounds(365,5,200,25);
        Score.setFont(new Font("Segoe Ui",0,20));
        Score.setForeground(Color.white);
        this.add(Score);

        JLabel Level = new JLabel("Level: "+(leve+1));
        Level.setBounds(365,610,200,25);
        Level.setFont(new Font("Segoe Ui",0,20));
        Level.setForeground(Color.white);
        this.add(Level);

        String score = (String) Integer.toString(numberScore);
        JLabel scoreUser = new JLabel(score);
        scoreUser.setBounds(370,25,200,25);
        scoreUser.setFont(new Font("Segoe Ui",0,15));
        scoreUser.setForeground(Color.white);
        this.add(scoreUser);

    }
    @Override
    public void paint(Graphics g) {

        g.drawImage( fondo, 0, 0, getWidth(), getHeight(), this);

        g.drawImage(Alien.getImagenAlien(),  Alien.getX(),Alien.getY(),100,100,this);
        g.drawImage(Nave.getImagenNave(),  Nave.getX(),Nave.getY(),Nave.getTamaño(),Nave.getTamaño(),this);

        g.drawImage(Bala.getImagenBala(),Bala.getX(),Bala.getY(),Bala.getTamañox(),Bala.getTamañoy(),this);
        g.drawImage(Bala.getImagenBala(),Bala.getX()+56,Bala.getY(),Bala.getTamañox(),Bala.getTamañoy(),this);

        if(Life.getNumero() == 3){
            g.drawImage(Life.getImageLife(),Life.getX()+30,Life.getY(),Life.getTamaño(),Life.getTamaño(),this);
            g.drawImage(Life.getImageLife(),Life.getX()+60,Life.getY(),Life.getTamaño(),Life.getTamaño(),this);
            g.drawImage(Life.getImageLife(),Life.getX(),Life.getY(),Life.getTamaño(),Life.getTamaño(),this);
        }

        this.setOpaque(false);
        super.paint(g);
    }





}