package miPrincipal.envio;

/**
 * Producto concreto: envío dentro del país.
 * Costo: $45.00 por kg.
 */
public class EnvioNacional extends EnvioBase {

    private static final double COSTO_POR_KG = 45.0;

    public EnvioNacional(String destinatario, double peso) {
        
    }

    @Override
    public double calcularCosto() {
        return 0;
    }

    @Override
    public String generarGuia() {
        return "GUIA-NAC-";
    }
}
