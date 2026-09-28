public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes);
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("================================");
        System.out.println("Empleado : " + nombre);
        System.out.println("Ventas   : $" + String.format("%.2f", ventasMes));
        System.out.println("Comision : $" + String.format("%.2f", comision));
        System.out.println("================================");
    }
}
