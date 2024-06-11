package ejercicios;

import modelos.Color;
import principal.ExcelReader;
import principal.Logs;

import java.util.ArrayList;
import java.util.List;

public class EjercicioColores {
    public static void main(String[] args) {
        Logs.info("Leyendo lista de productos desde excel");
        final var Colorlist = ExcelReader.getColorList();
        Logs.info("Filtrando lista");
        final var listaFiltrada = getListColor(Colorlist);
        System.out.println(listaFiltrada);

    }

    private static List<Color> getListColor(List<Color> listaTotal) {

        final var listaColor = new ArrayList<Color>();

        for (var nombre : listaTotal) {
            if (nombre.getNombre().equals("ROJO") || nombre.getNombre().equals("PLATA")) {
                listaColor.add(nombre);
            }
        }
        return listaColor;
    }
}

