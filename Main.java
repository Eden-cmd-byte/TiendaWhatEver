public class Main {
    public static void main(String[] args) {
        // Creamos una camisa y una sudadera
        Camisa c1 = new Camisa("Camisa Polo", 450.0, 10, "M", "Azul");
        Sudadera s1 = new Sudadera("Sudadera Hoodie", 800.0, 5, "Algodón", true);

        // Mostramos la información (usa el toString que definimos)
        System.out.println(c1.toString());
        System.out.println(s1.toString());

        // Probamos el método vender
        c1.vender(2);
        System.out.println("Nuevo stock de camisa: " + c1.getCantidad());
    }
}