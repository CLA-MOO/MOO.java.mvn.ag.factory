package miPrincipal.creator;

import miPrincipal.envio.Envio;
import miPrincipal.envio.EnvioInternacional;

/** Creador concreto que fabrica envíos internacionales. */
public class EnvioInternacionalCreador extends EnvioCreador {

    private final String destinatario;
    private final double peso;

    public EnvioInternacionalCreador(String destinatario, double peso) {
        
    }

    @Override
    public Envio crearEnvio() {
        return null;
    }
}
