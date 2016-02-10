import java.util.ArrayList;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    // identificador del jugador
    private int id;
    //ArrayList que guarda las cartas que tiene en la mano el jugador
    private ArrayList<String> mano;

    /**
     * Constructor de objetos de la clase jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        mano = new ArrayList<>();

    }

    /**
     *devuelve el identificador del jugador.
     */
    public int getId()
    {
        return id;
    }

    /**
     * agrega la carta unaCarta a las que posee el jugador.
     */
    public void recibirCarta(Carta unaCarta)
    {
        mano.add(unaCarta.getNombre());
    }

    /**
     * devuelve una coleccion de cadenas de las cartas que tiene en la mano
     */
    public ArrayList<String> cartasQueTieneEnLaMano()
    {
        return mano;
    }
}
