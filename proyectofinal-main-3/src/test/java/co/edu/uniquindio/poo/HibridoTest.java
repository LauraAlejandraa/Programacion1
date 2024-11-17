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
public class AdministradorTest {
    private static final Logger LOG = Logger.getLogger(AdministradorTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    //Prueba datos completos, verificando que el nombre sea igual
    @Test
    public void datosVacios() {
        
        LOG.info("Iniciado test datos Vacios");
        assertThrows(Throwable.class,()-> new Administrador(" "," "," "," "," "," "," "));
        LOG.info("Finalizando test datos Vacios");
    }

    //Prueba datos enteros, verificando que los años de antiguedad sean iguales a 3
    @Test
    public void datosEnteros() {
            
        LOG.info("Iniciado test datos Enteros");
        
        Bibliotecario bibliotecario1 = new Bibliotecario("Laura Torres", "1009876", "Lt@gmail.com", "313567332", 1000000, 3);
        assertEquals(3, bibliotecario1.getAntiguedad());

        LOG.info("Finalizando test datos Enteros");
    }
}
