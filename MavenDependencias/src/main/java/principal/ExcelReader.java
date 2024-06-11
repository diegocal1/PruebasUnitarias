package principal;

import com.poiji.bind.Poiji;
import modelos.Amigo;
import modelos.Color;
import modelos.Producto;
import modelos.Vector;
import modelos.Videojuego;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/main/resources/data/infoExcel.xlsx";

    public static List<Videojuego> getVideojuegoList() {
        Logs.info("Leyendo excel de la lista");
        return Poiji.fromExcel(new File(excelPath), Videojuego.class);
    }

    public static List<Amigo> getAmigoList() {
        Logs.info("Leyendo excel Amigos de la lista");
        return Poiji.fromExcel(new File(excelPath), Amigo.class);
    }

    public static List<Producto> getProductoList() {
        Logs.info("Leyendo excel Productos de la lista");
        return Poiji.fromExcel(new File(excelPath), Producto.class);
    }

    public static List<Color> getColorList() {
        Logs.info("Leyendo excel Productos de la lista");
        return Poiji.fromExcel(new File(excelPath), Color.class);
    }

    public static List<Vector> getVectorList() {
        Logs.info("Leyendo excel Productos de la lista");
        return Poiji.fromExcel(new File(excelPath), Vector.class);
    }


}
