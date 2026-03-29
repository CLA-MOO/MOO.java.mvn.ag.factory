package miPrincipal.envio;

/**
 * Clase base abstracta para los productos concretos de envío.
 * Concentra los atributos comunes y el cálculo auxiliar del sufijo de guía.
 */
public abstract class EnvioBase implements Envio {

    protected final String destinatario;
    protected final double peso;

    protected EnvioBase(String destinatario, double peso) {
        
    }

    /** Convierte el peso a unidades enteras para usar en el código de guía. */
    protected int pesoEnUnidades() {
        return 0;
    }
}
