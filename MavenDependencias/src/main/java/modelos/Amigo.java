package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Amigos")
public class Amigo {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("APELLIDO")
    private String apellido;
    @ExcelCellName("EDAD")
    private int edad;
    @ExcelCellName("CASO EXITO")
    private int casoExito;
    @ExcelCellName("CASO TOTALES")
    private int casoTotales;
    @ExcelCellName("EMPRESA")
    private String empresa;
    @ExcelCellName("TIPO")
    private String tipo;

    @Override
    public String toString() {
        final var multilinea = """
                {
                nombre: %s
                apellido: %s
                edad: %d
                casoExito: %d
                casoTotales: %d
                empresa: %s
                tipo: %s             
                }
                """;

        return String.format(
                multilinea,
                nombre,
                apellido,
                edad,
                casoExito,
                casoTotales,
                empresa,
                tipo
        );
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
}
