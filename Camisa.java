public class Camisa extends Ropa {
    private String talla;
    private String color;

    public Camisa(String nombre, double precio, int cantidad, String talla, String color) {
        super(nombre, precio, cantidad);
        this.talla = talla;
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " | Talla: " + talla + " | Color: " + color;
    }
}