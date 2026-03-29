package miPrincipal.creator;

/** Creador concreto que fabrica envíos nacionales. */
public class EnvioNacionalCreador extends EnvioCreador {

    private final String destinatario;
    private final double peso;

    public EnvioNacionalCreador(String destinatario, double peso) {
        
    }

    @Override
    public Envio crearEnvio() {
        return null;
    }
}
