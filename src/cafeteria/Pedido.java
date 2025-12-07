package cafeteria;

public class Pedido {

    private int id;
    private Producto producto;
    private int cantidad;
    private boolean entregado;

    public Pedido(int id, Producto producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.entregado = false;
    }

    public void entregarPedido() {
        if (!entregado) {
            for (int i = 0; i < cantidad; i++) {
                producto.registrarVenta();
            }
            entregado = true;
        }
    }

    public double calcularTotal() {
        return cantidad * producto.getPrecio();
    }

    public void mostrarDetalle() {
        System.out.println("Pedido #" + id);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + calcularTotal());
        System.out.println("Entregado: " + entregado);
    }

    public boolean isEntregado() {
        return entregado;
    }

    public double getTotal() {
        return calcularTotal();
    }
}
