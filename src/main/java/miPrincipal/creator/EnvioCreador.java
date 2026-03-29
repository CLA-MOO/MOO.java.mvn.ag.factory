package miPrincipal.creator;

import miPrincipal.embalaje.Embalaje;
import miPrincipal.envio.Envio;

/**
 * Creador abstracto del patrón Factory Method.
 * Declara el método fábrica crearEnvio() y define la operación
 * registrarEnvio() que lo usa internamente.
 */
public abstract class EnvioCreador {

    /** Factory Method: las subclases deciden qué tipo de Envio crear. */
    public abstract Envio crearEnvio();

    /** Operación de plantilla que usa el Factory Method y el embalaje indicado. */
    public void registrarEnvio(Embalaje embalaje) {
        
    }
}
