package parser;

import modelos.Videojuego;
import principal.ExcelReader;
import principal.Logs;

public class VideojuegoParser {
    public static Videojuego[] getVideojuegoArray() {
        Logs.info("Leo el excel");
        final var listaVideojuego = ExcelReader.getVideojuegoList();
        // busco el tamaño del array
        final var n = listaVideojuego.size();
        //inicio el array
        final var arrayVideojuego = new Videojuego[n];
        for (int i = 0; i < n; i++) {
            arrayVideojuego[i] = listaVideojuego.get(i);
        }

        return arrayVideojuego;
    }
}
