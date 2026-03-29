package miPrincipal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import miPrincipal.creator.EnvioCreador;
import miPrincipal.creator.EnvioInternacionalCreador;
import miPrincipal.creator.EnvioLocalCreador;
import miPrincipal.creator.EnvioNacionalCreador;
import miPrincipal.embalaje.Caja;
import miPrincipal.embalaje.Embalaje;
import miPrincipal.embalaje.EmbalajeFabrica;
import miPrincipal.embalaje.Sobre;
import miPrincipal.embalaje.Tubo;
import miPrincipal.envio.Envio;
import miPrincipal.envio.EnvioInternacional;
import miPrincipal.envio.EnvioLocal;
import miPrincipal.envio.EnvioNacional;

/**
 * Pruebas unitarias del Gestor de Envíos.
 */
public class AppTest {

    private static final double DELTA = 0.001;

    // ---------------------------------------------------------------
    // Pruebas de calcularCosto()
    // ---------------------------------------------------------------

    @Test
    public void testEnvioLocalCalcularCosto() {
        Envio envio = new EnvioLocal("Test", 1.0);
        assertEquals(15.0, envio.calcularCosto(), DELTA);
    }

    @Test
    public void testEnvioNacionalCalcularCosto() {
        Envio envio = new EnvioNacional("Test", 1.0);
        assertEquals(45.0, envio.calcularCosto(), DELTA);
    }

    @Test
    public void testEnvioInternacionalCalcularCosto() {
        Envio envio = new EnvioInternacional("Test", 1.0);
        assertEquals(120.0, envio.calcularCosto(), DELTA);
    }

    // ---------------------------------------------------------------
    // Pruebas de generarGuia()
    // ---------------------------------------------------------------

    @Test
    public void testEnvioLocalGenerarGuia() {
        Envio envio = new EnvioLocal("Juan Perez", 0.5);
        assertEquals("GUIA-LOCAL-JUANPEREZ-50", envio.generarGuia());
    }

    @Test
    public void testEnvioNacionalGenerarGuia() {
        Envio envio = new EnvioNacional("Maria Garcia", 2.0);
        assertEquals("GUIA-NAC-MARIAGARCIA-200", envio.generarGuia());
    }

    @Test
    public void testEnvioInternacionalGenerarGuia() {
        Envio envio = new EnvioInternacional("Carlos Ruiz", 1.2);
        assertEquals("GUIA-INTL-CARLOSRUIZ-120", envio.generarGuia());
    }

    // ---------------------------------------------------------------
    // Pruebas de EmbalajeFabrica (Simple Factory)
    // ---------------------------------------------------------------

    @Test
    public void testEmbalajeFabricaCrea_Caja() {
        Embalaje embalaje = EmbalajeFabrica.crearEmbalaje("caja");
        assertTrue(embalaje instanceof Caja);
        assertEquals("Caja", embalaje.getTipo());
    }

    @Test
    public void testEmbalajeFabricaCrea_Sobre() {
        Embalaje embalaje = EmbalajeFabrica.crearEmbalaje("sobre");
        assertTrue(embalaje instanceof Sobre);
        assertEquals("Sobre", embalaje.getTipo());
    }

    @Test
    public void testEmbalajeFabricaCrea_Tubo() {
        Embalaje embalaje = EmbalajeFabrica.crearEmbalaje("tubo");
        assertTrue(embalaje instanceof Tubo);
        assertEquals("Tubo", embalaje.getTipo());
    }

    // ---------------------------------------------------------------
    // Pruebas de los creadores (Factory Method)
    // ---------------------------------------------------------------

    @Test
    public void testEnvioLocalCreador_CreaEnvioLocal() {
        EnvioCreador creador = new EnvioLocalCreador("Test", 1.0);
        Envio envio = creador.crearEnvio();
        assertNotNull(envio);
        assertTrue(envio instanceof EnvioLocal);
    }

    @Test
    public void testEnvioNacionalCreador_CreaEnvioNacional() {
        EnvioCreador creador = new EnvioNacionalCreador("Test", 1.0);
        Envio envio = creador.crearEnvio();
        assertNotNull(envio);
        assertTrue(envio instanceof EnvioNacional);
    }

    @Test
    public void testEnvioInternacionalCreador_CreaEnvioInternacional() {
        EnvioCreador creador = new EnvioInternacionalCreador("Test", 1.0);
        Envio envio = creador.crearEnvio();
        assertNotNull(envio);
        assertTrue(envio instanceof EnvioInternacional);
    }
}

