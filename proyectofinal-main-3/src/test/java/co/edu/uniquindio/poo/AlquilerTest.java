package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlquilerTest {

    @Test
    public void testAutenticacion() {
        Empleado empleado = new Empleado ("Juan", "Hernandez", "123", "juan@gmail.com", "JuanUser", "Juan123", "", administrador);
        assertTrue(empleado.autenticar("carlos123", "contrasena123"));
        assertFalse(empleado.autenticar("carlos123", "wrongpass"));
    }

    @Test
    public void testBloquearCuenta() {
        Empleado empleado = new Empleado;
        empleado.bloquearCuenta();
        assertFalse(empleado.estaActivo());
    }
}