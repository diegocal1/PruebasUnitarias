package modelos;

public class Persona {
    private String nombre;
    private String email;
    private String contraseña;
    private int edad;
    private double peso;

    public Persona(String nombre, String email, String contraseña, int edad, double peso) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }
}
