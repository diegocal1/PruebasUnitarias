package ejercicios;

import modelos.Amigo;
import parser.AmigoParser;
import principal.ExcelReader;
import principal.Logs;

public class EjercicioAmigos {
    public static void main(String[] args) {
        Logs.info("Leyendoo  lista excel ");
        final var amigoList = ExcelReader.getAmigoList();
        Logs.info("Mostrando array amigo");
        final var arrayAmigo = AmigoParser.getAmigoArray();
        Logs.info("Mostrando lista filtrada");
        ordenarAlfabeticamente(arrayAmigo);
        filtroAbogados(arrayAmigo);

    }

    private static void ordenarAlfabeticamente(Amigo[] array) {
        final var n = array.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getTipo().compareTo(array[j + 1].getTipo()) > 0) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void filtroAbogados(Amigo[] array) {
        ordenarAlfabeticamente(array);
        for (var amigo : array) {
            if (amigo.getTipo().equals("ABOGADO")) {
                System.out.println(amigo);
            }
        }
    }

}



