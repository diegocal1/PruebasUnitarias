package ejercicios;

import modelos.Producto;
import parser.ProductoParser;
import principal.Logs;

public class EjercicioProductos {
    public static void main(String[] args) {
        final var ArrayProducto = ProductoParser.getProductoArray();
        // System.out.printf("%s", Arrays.toString(ArrayProducto));
        Logs.info("Mostrando productos con la letra A");
        buscarNombresConA(ArrayProducto);
    }

    private static void buscarNombresConA(Producto[] array) {
        for (Producto producto : array) {
            if (producto.getNombre().startsWith("A")) {
                System.out.println(producto.getNombre());
            }
        }
    }
}
