package cinema;

public class Reserva {

    private Pelicula pelicula;
    private Sala sala;
    private String cliente;

    public Reserva(Pelicula pelicula, Sala sala, String cliente) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
    }

    public void procesarReserva() {
        boolean vendida = pelicula.venderEntrada();
        boolean asiento = sala.ocuparAsiento();

        if (vendida && asiento) {
            System.out.println("☑️ Reserva procesada para " + cliente);
        } else {
            System.out.println("✖️ No se pudo procesar la reserva.");
        }
    }

    public void mostrarDetalle() {
        System.out.println("📄 Reserva de: " + cliente);
    }
}
