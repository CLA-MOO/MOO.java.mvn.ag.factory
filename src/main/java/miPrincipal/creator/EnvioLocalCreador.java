package miPrincipal.creator;

/** Creador concreto que fabrica envíos locales. */
public class EnvioLocalCreador extends EnvioCreador {

    private final String destinatario;
    private final double peso;

    public EnvioLocalCreador(String destinatario, double peso) {
        
    }

    @Override
    public Envio crearEnvio() {
        return null;
    }
}
