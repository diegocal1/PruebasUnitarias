package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Productos")
public class Producto {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("PRECIO")
    private double precio;
    @ExcelCellName("STOCK")
    private int stock;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("PERECIBLE")
    private boolean enPerecible;

    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre: %s,
                    precio: %.2f,
                    stock: %d,
                    peso: %.2f,
                    perecible: %b
                }
                """;
        return String.format(
                multilinea,
                nombre,
                precio,
                stock,
                peso,
                enPerecible
        );
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isEnPerecible() {
        return enPerecible;
    }
}
