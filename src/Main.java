import cinema.*;
import cafeteria.*;

public class Main {
    public static void main(String[] args) {

        Pelicula ghibli = new Pelicula(
                "El Viaje de Chihiro",
                "Animación / Fantasía",
                125,
                3
        );

        Sala salaGhibli = new Sala(2, "2D", 3);

        Reserva g1 = new Reserva(ghibli, salaGhibli, "Hugo");
        Reserva g2 = new Reserva(ghibli, salaGhibli, "Paco");
        Reserva g3 = new Reserva(ghibli, salaGhibli, "Luis");
        Reserva g4 = new Reserva(ghibli, salaGhibli, "Pato");

        g1.procesarReserva();
        g2.procesarReserva();
        g3.procesarReserva();
        g4.procesarReserva(); // ya no hay cupo

        System.out.println("\n--- Total función Estudio GHIBLI ---");
        ghibli.mostrarInfo();
        salaGhibli.mostrarEstado();

        g1.mostrarDetalle();
        g2.mostrarDetalle();
        g3.mostrarDetalle();
        g4.mostrarDetalle();

        // cafeteria

        Producto te = new Producto("Té Verde", 2500);
        Producto postre = new Producto("Tiramisú", 5000);

        Pedido c1 = new Pedido(3, te, 2);
        Pedido c2 = new Pedido(4, postre, 1);
        Pedido c3 = new Pedido(5, postre, 3);

        Cafeteria cafeteria = new Cafeteria("Café Cat Bus");

        cafeteria.agregarPedido(c1);
        cafeteria.agregarPedido(c2);
        cafeteria.agregarPedido(c3);

        c1.entregarPedido();
        c3.entregarPedido();

        System.out.println("\n--- Pedidos de Cafetería ---");
        cafeteria.mostrarPedidos();

        System.out.println("\n--- Venta total ---");
        cafeteria.mostrarVentasTotales();
    }
}
