/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MotoTest {
    private static final Logger LOG = Logger.getLogger(AdministradorTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    //Prueba datos completos, verificando que el nombre sea igual
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos Vacios");
        assertThrows(Throwable.class,()-> new Administrador(" "," "," "," "," "," "," "," "));
        LOG.info("Finalizando test datos Vacios");
    }

}
