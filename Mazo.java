import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{

    private ArrayList<Carta> mazoDeCartas;   

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        //incrementamos los valores del uno al 13 palo por palo
        mazoDeCartas = new ArrayList<Carta>();
        int index = 1;
        //Asigna numeros a las cartas y palo picas
        while (index < 14 ) {

            Carta carta = new Carta(index, " de picas "); //"picas" );
            mazoDeCartas.add(carta);
            index++;
        }
        index = 1;
        //Asigna numeros a las cartas y palo  corazones
        while (index < 14) {

            Carta carta = new Carta(index, " de corazones "); //"corazones" );
            mazoDeCartas.add(carta);
            index++;
        }
        index = 1;
        //Asigna numeros a las cartas y palo  diamantes
        while (index < 14) {
            Carta carta = new Carta(index," de diamantes "); //"diamantes" );
            mazoDeCartas.add(carta);            
            index++;
        }
        index = 1;
        //Asigna numeros a las cartas y palo  treboles
        while (index < 14) {
            Carta carta = new Carta(index," de treboles "); //"treboles" );
            mazoDeCartas.add(carta);            
            index++;
        }

    }

    /**
     * Metodo que desordena las cartas, permitiendo asi que queden barajadas.
     */
    public void barajar()
    {
        Collections.shuffle(mazoDeCartas);
    }

    /**
     * Metodo que retorna la primera carta del mazo y modifica el estado del mazo para reflejar que esa carta ya no se encuentra en el mazo
     */
    public Carta tomarPrimera()
    {
        Carta cartaUno = null;

        if(mazoDeCartas.size() > 0)
        {
            cartaUno = mazoDeCartas.get(0);
            mazoDeCartas.remove(0);
        }
        return cartaUno;
    }

    /**
     * Metodo que retorna el número de cartas que quedan en el mazo.
     */
    public int quedan(){
        return mazoDeCartas.size();
    }
}
