package parser;

import modelos.Amigo;
import principal.ExcelReader;

public class AmigoParser {
    public static Amigo[] getAmigoArray() {
        final var listaAmigo = ExcelReader.getAmigoList();
        final var n = listaAmigo.size();
        final var arrayAmigo = new Amigo[n];
        for (int i = 0; i < n; i++) {
            arrayAmigo[i] = listaAmigo.get(i);
            
        }
        return arrayAmigo;
    }
}
