package ejercicios;

import com.github.javafaker.Faker;
import modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class EjercicioPersonas {
    public static void main(String[] args) {
        List<Persona> listaPersonas = poblarListaPersonas();
        mostrarListaPersonas(listaPersonas);
    }

    public static List<Persona> poblarListaPersonas() {
        Faker faker = new Faker();
        List<Persona> listaPersonas = new ArrayList<>();

        // Generar un número aleatorio de usuarios entre 10 y 20
        int cantidadPersonas = faker.random().nextInt(10, 21);

        for (int i = 0; i < cantidadPersonas; i++) {
            String nombre = faker.name().fullName();
            String email = faker.internet().emailAddress();
            String contraseña = faker.internet().password();
            int edad = faker.number().numberBetween(20, 31);
            double peso = faker.number().randomDouble(2, 15, 20);

            Persona persona = new Persona(nombre, email, contraseña, edad, peso);
            listaPersonas.add(persona);
        }

        return listaPersonas;
    }

    public static void mostrarListaPersonas(List<Persona> listaPersonas) {
        for (Persona persona : listaPersonas) {
            System.out.printf("Nombre: %s%n", persona.getNombre());
            System.out.printf("Email: %s%n", persona.getEmail());
            System.out.printf("Contraseña: %s%n", persona.getContraseña());
            System.out.printf("Edad: %d%n", persona.getEdad());
            System.out.printf("Peso: %.2f%n%n", persona.getPeso());
        }
    }

}


