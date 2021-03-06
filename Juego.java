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
    private Mazo mazo;
    //Lista que añade jugadores al juego
    private ArrayList<Jugador> jugadores;
    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores)
    {
        mazo = new Mazo();//crea un mazo nuevo
        jugadores = new ArrayList<>();//lista nueva de jugadores
        int id = 1;//valor qu ele vamos a dar al primer jugador
        if (numeroJugadores >=2 && numeroJugadores <=8)//si introducimos un numero de jugadores entre los aceptados acepta, si no lo deja en 4 por defecto
        {
            while (id <= numeroJugadores)
            {
                jugadores.add(new Jugador(id));
                id++;
            }
            numeroJugadores = numeroJugadores; 

        }
        else//si el numero de jugadores no es correcto añade cuatro jugadores por defecto
        {
            jugadores.add(new Jugador(1));
            jugadores.add(new Jugador(2));
            jugadores.add(new Jugador(3));
            jugadores.add(new Jugador(4));
            numeroJugadores = 4;
        }
        this.numeroJugadores = numeroJugadores;
        mazo.barajar();
    }

    /**
     * método que reparte todas las cartas a los jugadores en la forma habitual 
     * en que se hace en un juego de cartas, es decir, barajando el mazo 
     * y entregando alternativamente cartas a los jugadores tomando siempre la primera carta del mazo. 
     * Al finalizar el reparto todos los jugadores deben tener el mismo número de cartas, 
     * por lo que es posible, dependiendo del número de estos,
     * que queden cartas en el mazo.999
     */

    public void repartir()
    {
        int cartasRepartidas = 0;
        int id = 0;
        int mazoEntero = 52;
        int cartasParaCadaJugador = mazoEntero / jugadores.size();
        if (mazoEntero % jugadores.size() != 0){
            System.out.println("No hay cartas suficientes en el mazo para repartir todas entre los jugadores");
        }
        while (cartasRepartidas < (cartasParaCadaJugador * jugadores.size())){
            jugadores.get(id).recibirCarta(mazo.tomarPrimera());
            id = id + 1;
            cartasRepartidas = cartasRepartidas + 1;
            if (id == jugadores.size()){
                id = 0;
            }
        }

    }

    /**
     * muestra por pantalla el id del jugador junto a las cartas que tiene en la mano
     */
    public void mostrarCartasJugadores()
    {
        int indice = 0;
        while (indice < jugadores.size()){
            System.out.println("Id de jugador--> " + jugadores.get(indice).getId() + "\nCartas en mano--> " + jugadores.get(indice).cartasQueTieneEnLaMano() + "\n");
            indice = indice + 1;
        }
    }
}

