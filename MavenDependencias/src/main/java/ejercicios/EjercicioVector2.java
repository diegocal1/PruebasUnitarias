package ejercicios;

import parser.VectorParser;
import principal.Logs;

public class EjercicioVector2 {
    public static void main(String[] args) {
        Logs.info("Obteniendo el mapa ");
        final var vectorMap = VectorParser.getMapVector();
        //System.out.println(vectorMap);
        double moduloRita = calcularModulo(vectorMap.get("RITA").getX(), vectorMap.get("RITA").getX());
        double moduloLaura = calcularModulo(vectorMap.get("LAURA").getX(), vectorMap.get("LAURA").getX());
        Logs.info("Obteniendo los módulos");
        System.out.printf("El modulo de Rita es %.2f%n", moduloRita);
        System.out.printf("El modulo de Laura es %.2f%n", moduloLaura);
    }

    private static double calcularModulo(double x, double y) {
        double modulo;
        modulo = Math.sqrt(x * x + y * y);
        return modulo;
    }
}

