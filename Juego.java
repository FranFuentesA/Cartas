import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    //atributo que guarda el numero de jugadores
    private int numeroJugadores;
    //Lista que representa el mazo de cartas
    private ArrayList<Carta> mazo;
    //Lista que añade jugadores al juego
    private ArrayList<Jugador> jugadores;
    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores)
    {
        this.numeroJugadores = numeroJugadores;
        if (numeroJugadores >=2 && numeroJugadores <=8)//si introducimos un numero de jugadores entre los aceptados acepta, si no lo deja en 4 por defecto
        {
            numeroJugadores = numeroJugadores;
        }
        else
        {
            numeroJugadores = 4;
        }
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        int contador = 0;
        while(contador < numeroJugadores)
        {
            Jugador jugador = new Jugador(contador);
            jugadores.add(jugador);
            contador = contador + 1;
        }
        ArrayList<Carta> mazo = new ArrayList<Carta>();
    }

    /**
     * método que reparte todas las cartas a los jugadores en la forma habitual 
     * en que se hace en un juego de cartas, es decir, barajando el mazo 
     * y entregando alternativamente cartas a los jugadores tomando siempre la primera carta del mazo. 
     * Al finalizar el reparto todos los jugadores deben tener el mismo número de cartas, 
     * por lo que es posible, dependiendo del número de estos,
     * que queden cartas en el mazo.999
     */
    public void repartir(int y)
    {

    }

    /**
     * muestra por pantalla el id del jugador junto a las cartas que tiene en la mano
     */
    public void mostrarCartasJugadores()
    {
        for(Jugador jugador : jugadores)
        {
            System.out.println("Id.Jugador: "+jugador.getId()+"__Cartas en la Mano: "+jugador.cartasQueTieneEnLaMano());

        }
    }
}
