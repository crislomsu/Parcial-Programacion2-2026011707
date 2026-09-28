public class Main {
    public static void main(String[] args) {
        Vendedor empleado1 = new Vendedor("Bayron Alexander Orellana Rojas", 15000.0);
        Vendedor empleado2 = new Vendedor("Vendedor Demo", 8500.0);

        System.out.println("-- Reporte de Comisiones --");
        empleado1.mostrarDetalle();
        empleado2.mostrarDetalle();
    }
}
