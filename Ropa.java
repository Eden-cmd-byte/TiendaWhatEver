public class Ropa {
    private String nombre;
    private double precio;
    private int cantidad;

    public Ropa(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public void vender(int cantVenta) {
        if (cantVenta <= cantidad) {
            this.cantidad -= cantVenta;
        } else {
            System.out.println("Error: No hay suficiente stock de " + nombre);
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre: %-15s | Precio: $%-7.2f | Stock: %-3d", nombre, precio, cantidad);
    }
}