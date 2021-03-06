------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:


Queremos programar un juego de cartas basado en la baraja de cartas francesas o de póker. En el mismo pueden participar de 2 a 8 jugadores. Para comenzar nos basta con conseguir que las cartas se repartan entre los jugadores.

Para ello se han identificado de momento las siguientes clases y sus métodos:

Mazo

--Mazo: el constructor de esta clase se encarga de crear todas las cartas del mazo.
barajar(): baraja el mazo de cartas.
tomarPrimera(): retorna la primera carta del mazo y modifica el estado del mazo para reflejar que esa carta ya no se encuentra en el mazo. En caso de que no queden cartas en el mazo devuelve null.
quedan(): retorna el número de cartas que quedan en el mazo.
Carta

--Carta(valor, palo): constructor de la clase Carta.
getNombre(): devuelve una cadena con el nombre de la carta.
getValor(): retorna un entero con el valor correspondiente a la carta (1, 2, ..., 13).
getPalo(): retorna una cadena que contiene el palo correspondiente a la carta (picas, treboles, diamantes o corazones).
getNombre(): devuelve una cadena con el nombre completo de la carta.
Jugador

--Jugador(id): este método crea un objeto jugador que no tiene cartas en su poder con el identificador indicado como parámetro.
getId(): devuelve el identificador del jugador.
recibirCarta(unaCarta): agrega la carta unaCarta a las que posee el jugador.
cartasQueTieneEnLaMano(): devuelve una colección de cadenas con los nombres de las cartas.

--Juego
Juego(numeroJugadores): constructor que crea un objeto juego, el cual crea el numero de jugadores indicados y crea el mazo. Si el número de jugadores no es válido se crea un juego con 4 jugadores por defecto.
repartir(): método que reparte todas las cartas a los jugadores en la forma habitual en que se hace en un juego de cartas, es decir, barajando el mazo y entregando alternativamente cartas a los jugadores tomando siempre la primera carta del mazo. Al finalizar el reparto todos los jugadores deben tener el mismo número de cartas, por lo que es posible, dependiendo del número de estos, que queden cartas en el mazo.
mostrarCartasJugadores(): método que muestra por pantalla el id de cada jugador junto a la cartas que tiene en la mano.
Para interactuar con el programa en esta versión inicial, crearemos con BlueJ un objeto Juego y luego invocaremos a los métodos repartir y mostrarCartasJugadores.