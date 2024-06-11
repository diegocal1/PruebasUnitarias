package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Videojuegos")
public class Videojuego {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("EPOCA")
    private int epoca;
    @ExcelCellName("PRECIO")
    private double precio;
    @ExcelCellName("DURACION")
    private int duracion;
    @ExcelCellName("GENERO")
    private String genero;
    @ExcelCellName("EMPRESA")
    private String empresa;

    @Override
    public String toString() {
        final var multilinea = """
                {
                nombre: %s
                epoca: %d
                precio:%.2f
                duracion: %d
                genero: %s
                empresa: %s      
                }
                """;
        return String.format(
                multilinea,
                nombre,
                epoca,
                precio,
                duracion,
                genero,
                empresa
        );
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getNombre() {
        return nombre;
    }
}
