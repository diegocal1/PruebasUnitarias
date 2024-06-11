package ejercicios;

import modelos.Videojuego;
import parser.VideojuegoParser;
import principal.Logs;

public class EjercicioVideojuegos2 {
    public static void main(String[] args) {
        Logs.info("Obtengo el array videojuego");
        final var arrayVideojuego = VideojuegoParser.getVideojuegoArray();
        Logs.info("Filtro el array");
        buscarNombresConT(arrayVideojuego);
    }


    private static void buscarNombresConT(Videojuego[] array) {
        for (Videojuego juego : array) {
            if (juego.getNombre().startsWith("T")) {
                System.out.println(juego.getNombre());
            }
        }
    }
}
