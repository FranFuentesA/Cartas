import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // Almacena todas las cartas del mazo
    private int valor;

    private String palo;

    /**
     * Constructor for objects of class carta
     */
    public Carta(int valor, String palo)
    {
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Metodo que devuelve el nombre.
     */
    public String getNombre ()
    {
        String nombre = valor + "de" + palo;
        if (valor == 11){
            nombre = "Valet de " + palo;
        }else if (valor == 12){
            nombre = nombre = "dame de " + palo; 
        }else if (valor == 13){
            nombre = nombre = "Roy de " + palo; 
        }else if (valor == 1){
            nombre = "As " + palo;          
        }
        return nombre;
    }
    
    /**
     * Metodo que devuelve el valor de una carta
     */
    public int getValor()
    {
        return valor;
    }
    
    /**
     * Metodo que devuelve el palo de una carta
     */
    public String getPalo()
    {
        return palo;
    }

}