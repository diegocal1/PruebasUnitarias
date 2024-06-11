package ejercicios;

import principal.JsonReader;
import principal.Logs;

public class EjercicioUsuarioJson {
    public static void main(String[] args) {
        final var usuarioPath = "src/main/resources/data/usuario.json";
        Logs.info("Consumiendo el Json");
        final var user = JsonReader.getUsuario(usuarioPath);
        Logs.info("Mostrando el Json");
        System.out.println(user);
        final var balanceParseado = parsearBalance(user.getBalance());
        final var edadUser = user.getAge();
        final var nombreUser = user.getName();
        verificarHipoteca(balanceParseado, edadUser, nombreUser);
        Logs.info("Mostrando resultado del método");

    }

    private static double parsearBalance(String balance) {
        // Eliminar el signo $
        String balanceSinSigno = balance.substring(1);
        // Convertir a tipo double
        return Double.parseDouble(balanceSinSigno);
    }

    private static void verificarHipoteca(double balance, int edad, String name) {
        if (balance > 3500 && edad < 40) {
            System.out.printf("La persona %s tiene un crédito aprobado", name);
        } else {
            System.out.printf("La persona %s tiene un crédito desaprobado", name);
        }
    }
}
