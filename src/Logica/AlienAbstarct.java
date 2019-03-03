package Logica;

import java.awt.*;

public class AlienAbstarct {
    public static boolean muerto;
    public static boolean golpeado;



    public void danio()
    {
        if(muerto)
            return;
        if(golpeado==true)
            muerto=true;
    }

    public boolean getGolpe()
    {
        return golpeado;
    }

    public void setGolpe()
    {
        this.golpeado = golpeado;
    }
    public boolean getMuerto()
    {
        return muerto;
    }
    public void setMuerto()
    {
        this.muerto = muerto;
    }

    void paint(Graphics g) {
    }
}
