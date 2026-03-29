package miPrincipal.envio;

/**
 * Producto concreto: envío dentro de la misma ciudad.
 * Costo: $15.00 por kg.
 */
public class EnvioLocal extends EnvioBase {

    private static final double COSTO_POR_KG = 15.0;

    public EnvioLocal(String destinatario, double peso) {
        
    }

    @Override
    public double calcularCosto() {
        return 0;
    }

    @Override
    public String generarGuia() {
        return "GUIA-LOCAL-";
    }
}
