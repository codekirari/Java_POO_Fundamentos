package cafeteria;

public class Producto {

    private String nombre;
    private double precio;
    private int vendidos;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.vendidos = 0;
    }

    public void registrarVenta() {
        vendidos++;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Vendidos: " + vendidos);
    }
}
