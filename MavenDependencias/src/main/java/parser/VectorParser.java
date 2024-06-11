package parser;

import modelos.Vector;
import principal.ExcelReader;
import principal.Logs;

import java.util.HashMap;
import java.util.Map;

public class VectorParser {

    public static Map<String, Vector> getMapVector() {
        Logs.info("Obtengo la lista de excel");
        final var vectorLista = ExcelReader.getVectorList();
        final var map = new HashMap<String, Vector>();
        for (var elemento : vectorLista) {
            map.put(elemento.getNombre(), elemento);
        }

        return map;
    }
}
