package principal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import modelos.Ataque;
import modelos.Usuario;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    public static Usuario getUsuario(String path) {
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(path), Usuario.class);
        } catch (IOException ioException) {
            Logs.error("ioException: %s", ioException.getLocalizedMessage());
            throw new RuntimeException();
        }
    }

    public static Ataque[] getAtaqueArray(String path) {
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(
                    new File(path),
                    TypeFactory.defaultInstance().constructArrayType(Ataque.class));
        } catch (IOException ioException) {
            Logs.error("ioException: %s", ioException.getLocalizedMessage());
            throw new RuntimeException();
        }
    }
}

