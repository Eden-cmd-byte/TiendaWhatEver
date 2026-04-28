import java.io.*;

public class SimulacionTiendaWhatEver {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TiendaWhatEver tienda = new TiendaWhatEver();
        String op;

        do {
            System.out.println("\n********** TIENDA WHATEVER **********");
            System.out.println("1) Ver camisas           2) Ver sudaderas");
            System.out.println("3) Agregar camisa        4) Agregar sudadera");
            System.out.println("5) Comprar camisa        6) Comprar sudadera");
            System.out.println("7) Reporte de stock      8) Reporte de ventas");
            System.out.println("9) Salir");
            System.out.print("Seleccione: ");
            op = reader.readLine();

            switch (op) {
                case "1": case "2": case "7":
                    tienda.mostrarInventario();
                    break;
                case "3":
                    System.out.print("Nombre: "); String n = reader.readLine();
                    System.out.print("Precio: "); double p = Double.parseDouble(reader.readLine());
                    System.out.print("Cantidad: "); int c = Integer.parseInt(reader.readLine());
                    System.out.print("Talla: "); String t = reader.readLine();
                    System.out.print("Color: "); String col = reader.readLine();
                    tienda.agregarCamisa(new Camisa(n, p, c, t, col));
                    break;
                case "4":
                    System.out.print("Nombre: "); String ns = reader.readLine();
                    System.out.print("Precio: "); double ps = Double.parseDouble(reader.readLine());
                    System.out.print("Cantidad: "); int cs = Integer.parseInt(reader.readLine());
                    System.out.print("Material: "); String m = reader.readLine();
                    System.out.print("¿Con capucha? (true/false): "); boolean cap = Boolean.parseBoolean(reader.readLine());
                    tienda.agregarSudadera(new Sudadera(ns, ps, cs, m, cap));
                    break;
                case "5":
                    System.out.print("Índice de camisa a vender: ");
                    tienda.venderCamisa(Integer.parseInt(reader.readLine()));
                    break;
                case "6":
                    System.out.print("Índice de sudadera a vender: ");
                    tienda.venderSudadera(Integer.parseInt(reader.readLine()));
                    break;
            }
        } while (!op.equals("9"));
    }
}