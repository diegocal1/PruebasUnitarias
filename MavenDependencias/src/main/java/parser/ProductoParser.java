package parser;

import modelos.Producto;
import principal.ExcelReader;

public class ProductoParser {
    public static Producto[] getProductoArray() {
        final var ProductoArray = ExcelReader.getProductoList();
        final var n = ProductoArray.size();
        final var ArrayProducto = new Producto[n];
        for (int i = 0; i < n; i++) {
            ArrayProducto[i] = ProductoArray.get(i);

        }
        return ArrayProducto;

    }
}
