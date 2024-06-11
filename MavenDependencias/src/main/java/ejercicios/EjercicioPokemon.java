package ejercicios;

import com.github.javafaker.Faker;

import java.util.Scanner;

public class EjercicioPokemon {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese el nombre del Pokémon
        Scanner scanner = new Scanner(System.in);
        Faker faker = new Faker();
        System.out.print("Ingrese el nombre del Pokémon: ");
        final var nombre = scanner.nextLine();

        final var edad = faker.number().numberBetween(20, 31); // El rango superior es exclusivo
        final var peso = faker.number().randomDouble(2, 15, 21); // Rango de 15 a 20
        final var poderAtaque = faker.number().numberBetween(20, 101); // El rango superior es exclusivo
        final var frase = faker.lorem().sentence();
        final var apellido = faker.name().lastName();

        System.out.println("Información del Pokémon:");
        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Edad: %d%n", edad);
        System.out.printf("Peso: %.2f%n", peso);
        System.out.printf("Poder de Ataque: %d%n", poderAtaque);
        System.out.printf("Frase: %s%n", frase);
        System.out.printf("Apellido: %s%n", apellido);
    }
}
