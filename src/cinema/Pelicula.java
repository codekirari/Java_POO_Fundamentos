package cinema;

public class Pelicula {
    private  String titulo;
    private String genero;
    private int duracion;
    private int entradasDisponibles;

    public Pelicula(String titulo, String genero, int duracion, int entradasDisponibles) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.entradasDisponibles = entradasDisponibles;
    }
    public boolean venderEntrada() {
        if (entradasDisponibles > 0) {
            entradasDisponibles--;
            return true;
        } else {
            System.out.println("No hay entradas disponibles.");
            return false;
        }
    }
    public void mostrarInfo() {
        System.out.println("🎬 Película: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Entradas disponibles: " + entradasDisponibles);
    }
}