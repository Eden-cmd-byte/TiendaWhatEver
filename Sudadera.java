public class Sudadera extends Ropa {
    private String material;
    private boolean conCapucha;

    public Sudadera(String nombre, double precio, int cantidad, String material, boolean conCapucha) {
        super(nombre, precio, cantidad);
        this.material = material;
        this.conCapucha = conCapucha;
    }

    @Override
    public String toString() {
        return super.toString() + " | Material: " + material + " | Capucha: " + (conCapucha ? "Sí" : "No");
    }
}