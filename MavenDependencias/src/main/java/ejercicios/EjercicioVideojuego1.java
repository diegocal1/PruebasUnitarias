package ejercicios;

import modelos.Videojuego;
import principal.ExcelReader;
import principal.Logs;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego1 {
    public static void main(String[] args) {
        Logs.info("Mostrando la información de la lista videojuegos");
        final var videojuegoList = ExcelReader.getVideojuegoList();
        Logs.info("Filtrando lista");
        final var listaEmpresaFiltrada = getListEmpresa(videojuegoList);
        Logs.info("Mostrando lista filtrada");
        System.out.println(listaEmpresaFiltrada);
    }

    private static List<Videojuego> getListEmpresa(List<Videojuego> listaTotal) {
        final var listaEmpresa = new ArrayList<Videojuego>();

        for (var empresa : listaTotal) {
            if (empresa.getEmpresa().equals("XBOX")) {
                listaEmpresa.add(empresa);
            }
        }
        return listaEmpresa;
    }
}

