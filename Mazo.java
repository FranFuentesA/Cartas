import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collection;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{

    private ArrayList<Carta> mazo;
    
    
   
    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
       //incrementar los valores del uno al 13 
       //incrementar los palos
        int index = 0;
        int valor = 0;
        String nombre = "";
        //Asigna numeros a las cartas
       while (index < 13) {
            Carta carta = new Carta(valor, ""); //"picas" );
            mazo.add(carta);
            valor++;
            index++;
        }
       
    }
}
