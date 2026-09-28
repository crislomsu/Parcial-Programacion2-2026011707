// Bayron = 6 letras -> porcentaje = 5 + 6 = 11%
public class ComisionPersonalizada implements EstrategiaComision {

    private static final double PORCENTAJE = 0.11;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE;
    }
}
