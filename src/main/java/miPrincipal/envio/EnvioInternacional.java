package miPrincipal.envio;

/**
 * Producto concreto: envío fuera del país.
 * Costo: $120.00 por kg.
 */
public class EnvioInternacional extends EnvioBase {

    private static final double COSTO_POR_KG = 120.0;

    public EnvioInternacional(String destinatario, double peso) {
        
    }

    @Override
    public double calcularCosto() {
        return 0;
    }

    @Override
    public String generarGuia() {
        return "GUIA-INTL-";
    }
}
