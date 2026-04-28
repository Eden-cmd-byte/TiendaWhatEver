public class TiendaWhatEver {
    public static final int NumeroMaxCamisas = 10;
    public static final int NumeroMaxSudaderas = 10;

    private Camisa[] camisas = new Camisa[NumeroMaxCamisas];
    private int numeroDeCamisas = 0;
    private Sudadera[] sudaderas = new Sudadera[NumeroMaxSudaderas];
    private int numeroDeSudaderas = 0;

    public void agregarCamisa(Camisa c) {
        if (numeroDeCamisas < NumeroMaxCamisas) {
            camisas[numeroDeCamisas++] = c;
        } else {
            System.out.println("Almacén de camisas lleno.");
        }
    }

    public void agregarSudadera(Sudadera s) {
        if (numeroDeSudaderas < NumeroMaxSudaderas) {
            sudaderas[numeroDeSudaderas++] = s;
        } else {
            System.out.println("Almacén de sudaderas lleno.");
        }
    }

    public void venderCamisa(int pos) {
        if (pos >= 0 && pos < numeroDeCamisas) {
            camisas[pos].vender(1);
        } else {
            System.out.println("Posición de camisa no válida.");
        }
    }

    public void venderSudadera(int pos) {
        if (pos >= 0 && pos < numeroDeSudaderas) {
            sudaderas[pos].vender(1);
        } else {
            System.out.println("Posición de sudadera no válida.");
        }
    }

    public void mostrarInventario() {
        System.out.println("\n--- INVENTARIO ACTUAL ---");
        System.out.println("[CAMISAS]");
        for (int i = 0; i < numeroDeCamisas; i++) {
            System.out.println(i + ". " + camisas[i]);
        }
        System.out.println("\n[SUDADERAS]");
        for (int i = 0; i < numeroDeSudaderas; i++) {
            System.out.println(i + ". " + sudaderas[i]);
        }
    }
}