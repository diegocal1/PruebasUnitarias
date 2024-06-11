package ejercicios;

import modelos.Ataque;
import principal.JsonReader;
import principal.Logs;

import java.util.Arrays;

public class EjercicioAtaque {
    public static void main(String[] args) {
        final var ataquePath = "src/main/resources/data/ataques.json";
        Logs.info("Consumiendo el array");
        final var arrayAtaque = JsonReader.getAtaqueArray(ataquePath);
        Logs.info("Mostrando el array");
        ordenarPoderAtaque(arrayAtaque);
        System.out.printf("%s", Arrays.toString(arrayAtaque));


    }

    private static void ordenarPoderAtaque(Ataque[] array) {
        final var n = array.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getPower() > array[j + 1].getPower()) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}