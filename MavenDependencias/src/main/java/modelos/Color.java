package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Colores")
public class Color {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("ES_PRIMARIO")
    private boolean enEsPrimario;
    @ExcelCellName("HEXADECIMAL")
    private String hexadecimal;

    @Override
    public String toString() {
        final var multilinea = """
                 {
                 Nombre: %s,
                 EsPrimario: %b,
                 Hexadecimal: %s
                }
                """;
        return String.format(
                multilinea,
                nombre,
                enEsPrimario,
                hexadecimal

        );
    }

    public String getNombre() {
        return nombre;
    }
}
