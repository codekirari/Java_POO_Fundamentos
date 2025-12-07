package cinema;

public class Sala {
    private int id;
    private String tipo;
    private int capacidad;
    private int ocupados;

    public Sala(int id, String tipo, int capacidad){
        this.id = id;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ocupados = 0;
    }
    public boolean ocuparAsiento() {
        if (ocupados < capacidad) {
            ocupados++;
            return true;
        } else {
            System.out.println("La sala está llena.");
            return false;
        }
    }

    public void mostrarEstado() {
        System.out.println("🎟️ Sala " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Asientos ocupados: " + ocupados);
    }
}
