package ejercicio1;

public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("Crónicas marcianas");
        Audiolibro audio = new Audiolibro("El Principito");

        libro.mostrarDescripcion();
        audio.mostrarDescripcion();
    }
}