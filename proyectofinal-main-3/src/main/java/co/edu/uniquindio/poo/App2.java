package co.edu.uniquindio.poo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class App2 {
    private static List<Empleado> empleados = new ArrayList<>();
    private static List<Administrador> administradores = new ArrayList<>();
    private static List<Vehiculo> vehiculos = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Transaccion> transacciones = new ArrayList<>();

    public static void main(String[] args) {
        inicializarDatos();
        boolean salir = false;

        while (!salir) {
            String[] opciones = {"Login como Empleado", "Login como Administrador", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, 
                "=== Bienvenido a Tu Carro UQ ===", 
                "Menú Principal", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

            switch (opcion) {
                case 0:
                    loginEmpleado();
                    break;
                case 1:
                    loginAdministrador();
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar Tu Carro UQ.");
    }

    private static void inicializarDatos() {
        // Datos iniciales de ejemplo
        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com",
                "juan123", "1234", "respuesta1");

        administradores.add(administrador1);

        empleados.add(new Empleado("Luis", "Martínez", "1112223334", "luis.martinez@mail.com", 
                "luis001", "456", "respuestaA", administrador1));

        vehiculos.add(new Moto("MOTO001", "Yamaha", "MT-07", true, 6, 200.0, 689.0, Transmision.MANUAL,
                Combustible.GASOLINA));
        vehiculos.add(new Moto("MOTO002", "Kawasaki", "Ninja 400", false, 6, 190.0, 399.0, Transmision.MANUAL,
                Combustible.GASOLINA));
    }

    private static void loginEmpleado() {
        String username = JOptionPane.showInputDialog("Ingrese su username:");
        String password = JOptionPane.showInputDialog("Ingrese su contraseña:");

        for (Empleado empleado : empleados) {
            if (empleado.getUsuario().equals(username) && empleado.getContraseña().equals(password)) {
                JOptionPane.showMessageDialog(null, "Login exitoso como Empleado");
                menuEmpleado(empleado);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static void loginAdministrador() {
        String username = JOptionPane.showInputDialog("Ingrese su username:");
        String password = JOptionPane.showInputDialog("Ingrese su contraseña:");

        for (Administrador admin : administradores) {
            if (admin.getUsuario().equals(username) && admin.getContraseña().equals(password)) {
                JOptionPane.showMessageDialog(null, "Login exitoso como Administrador");
                menuAdministrador(admin);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static void menuEmpleado(Empleado empleado) {
        boolean salir = false;
        while (!salir) {
            String[] opciones = {"Ver vehículos disponibles", "Registrar transacción", "Cerrar sesión"};
            int opcion = JOptionPane.showOptionDialog(null, 
                "=== Menú de Empleado ===", 
                "Opciones de Empleado", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

            switch (opcion) {
                case 0:
                    verVehiculos();
                    break;
                case 1:
                    registrarTransaccion(empleado);
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void menuAdministrador(Administrador admin) {
        boolean salir = false;
        while (!salir) {
            String[] opciones = {"Ver vehículos disponibles", "Agregar nuevo vehículo", "Cerrar sesión"};
            int opcion = JOptionPane.showOptionDialog(null, 
                "=== Menú de Administrador ===", 
                "Opciones de Administrador", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

            switch (opcion) {
                case 0:
                    verVehiculos();
                    break;
                case 1:
                    agregarVehiculo();
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void verVehiculos() {
        StringBuilder sb = new StringBuilder("Vehículos Disponibles:\n");
        for (Vehiculo vehiculo : vehiculos) {
            sb.append(vehiculo.getMarca() + " " + vehiculo.getModelo()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Vehículos Disponibles", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void registrarTransaccion(Empleado empleado) {
        String clienteNombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        if (clienteNombre != null && !clienteNombre.isEmpty()) {
            // Simulamos la creación de una transacción
            Transaccion transaccion = new Transaccion(clienteNombre, empleado, null, null);
            transacciones.add(transaccion);
            JOptionPane.showMessageDialog(null, "Transacción registrada exitosamente.");
        }
    }


    private static void agregarVehiculo() {
        String[] opciones = {"Moto", "Sedán", "Deportivo", "Camioneta", "Pick-up", "Eléctrico", "Híbrido", "Van", "Camión", "Bus"};
        int tipoVehiculo = JOptionPane.showOptionDialog(null, 
            "Seleccione el tipo de vehículo:", 
            "Tipo de Vehículo", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            opciones, 
            opciones[0]);

        String codigo = JOptionPane.showInputDialog("Ingrese el código del vehículo:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        String esNuevoStr = JOptionPane.showInputDialog("¿El vehículo es nuevo? (true/false):");
        boolean esNuevo = Boolean.parseBoolean(esNuevoStr);
        String cambiosStr = JOptionPane.showInputDialog("Ingrese la cantidad de cambios:");
        int cambios = Integer.parseInt(cambiosStr);
        String velocidadMaxStr = JOptionPane.showInputDialog("Ingrese la velocidad máxima (km/h):");
        double velocidadMax = Double.parseDouble(velocidadMaxStr);
        String cilindrajeStr = JOptionPane.showInputDialog("Ingrese el cilindraje:");
        double cilindraje = Double.parseDouble(cilindrajeStr);

        String transmisionInput = JOptionPane.showInputDialog("¿El vehículo tiene transmisión automática? (AUTOMATICA/MANUAL):");
        Transmision transmision = null;
        try {
            transmision = Transmision.valueOf(transmisionInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido para transmisión. Se asignará el valor por defecto: MANUAL.");
            transmision = Transmision.MANUAL; // Valor por defecto
        }

        String combustibleInput = JOptionPane.showInputDialog("¿El vehículo qué tipo de combustible tiene? (GASOLINA/DIESEL/ELECTRICO/HIBRIDO):");
        Combustible combustible = null;
        try {
            combustible = Combustible.valueOf(combustibleInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido para combustible. Se asignará el valor por defecto: GASOLINA.");
            combustible = Combustible.GASOLINA; // Valor por defecto
        }

        Vehiculo nuevoVehiculo = null;
        switch (tipoVehiculo) {
            case 0:  // Moto
                nuevoVehiculo = new Moto(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible);
                break;
            case 1:  // Sedán
                String pasajerosStr = JOptionPane.showInputDialog("Ingrese el número de pasajeros:");
                int numeroPasajeros = Integer.parseInt(pasajerosStr);
                String puertasStr = JOptionPane.showInputDialog("Ingrese el número de puertas:");
                int numeroPuertas = Integer.parseInt(puertasStr);
                String bolsasStr = JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:");
                int numeroBolsasAire = Integer.parseInt(bolsasStr);
                String aireAcondicionadoStr = JOptionPane.showInputDialog("¿El vehículo tiene aire acondicionado? (true/false):");
                boolean aireAcondicionado = Boolean.parseBoolean(aireAcondicionadoStr);
                String absStr = JOptionPane.showInputDialog("¿El vehículo tiene ABS? (true/false):");
                boolean abs = Boolean.parseBoolean(absStr);
                String camaraReversaStr = JOptionPane.showInputDialog("¿El vehículo tiene cámara reversa? (true/false):");
                boolean camaraReversa = Boolean.parseBoolean(camaraReversaStr);
                String sensorColisionStr = JOptionPane.showInputDialog("¿El vehículo tiene sensor de colisión? (true/false):");
                boolean sensorColision = Boolean.parseBoolean(sensorColisionStr);
                String sensorTraficoStr = JOptionPane.showInputDialog("¿El vehículo tiene sensor de tráfico? (true/false):");
                boolean sensorTrafico = Boolean.parseBoolean(sensorTraficoStr);
                String asistentePermanenciaCarrilStr = JOptionPane.showInputDialog("¿El vehículo tiene asistente de permanencia en carril? (true/false):");
                boolean asistentePermanenciaCarril = Boolean.parseBoolean(asistentePermanenciaCarrilStr);
                String velocidadCruceroStr = JOptionPane.showInputDialog("¿El vehículo tiene velocidad crucero? (true/false):");
                boolean velocidadCrucero = Boolean.parseBoolean(velocidadCruceroStr);
                String capacidadCargaStr = JOptionPane.showInputDialog("Ingrese la capacidad de carga (kg):");
                double capacidadCarga = Double.parseDouble(capacidadCargaStr);

                nuevoVehiculo = new Sedan(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible, numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa, sensorColision, sensorTrafico, asistentePermanenciaCarril, velocidadCrucero, capacidadCarga);
                break;
            case 2:  // Deportivo
                String caballosStr = JOptionPane.showInputDialog("Ingrese el número de caballos de fuerza:");
                int caballosFuerza = Integer.parseInt(caballosStr);
                String tiempoCienStr = JOptionPane.showInputDialog("Ingrese el tiempo en segundos para alcanzar los 100 km/h:");
                double tiempoCien = Double.parseDouble(tiempoCienStr);
                String pasajerosDeportivoStr = JOptionPane.showInputDialog("Ingrese el número de pasajeros:");
                int numeroPasajerosDeportivo = Integer.parseInt(pasajerosDeportivoStr);
                String puertasDeportivoStr = JOptionPane.showInputDialog("Ingrese el número de puertas:");
                int numeroPuertasDeportivo = Integer.parseInt(puertasDeportivoStr);
                String bolsasAireDeportivoStr = JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:");
                int numeroBolsasAireDeportivo = Integer.parseInt(bolsasAireDeportivoStr);

                nuevoVehiculo = new Deportivo(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible, numeroPasajerosDeportivo, numeroPuertasDeportivo, numeroBolsasAireDeportivo, caballosFuerza, tiempoCien);
                break;
            case 3:  // Camioneta
                // Similar al caso 2 con opciones adicionales como 4x4, etc.
                break;
            case 6:  // Eléctrico
                String autonomiaStr = JOptionPane.showInputDialog("Ingrese la autonomía (en km):");
                double autonomia = Double.parseDouble(autonomiaStr);
                String tiempoCargaStr = JOptionPane.showInputDialog("Ingrese el tiempo de carga (en horas):");
                double tiempoCarga = Double.parseDouble(tiempoCargaStr);
                nuevoVehiculo = new Electrico(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible, autonomia, tiempoCarga);
                break;
            case 7:  // Híbrido
                String enchufableStr = JOptionPane.showInputDialog("¿El vehículo es enchufable? (true/false):");
                boolean enchufable = Boolean.parseBoolean(enchufableStr);
                String ligeroStr = JOptionPane.showInputDialog("¿El vehículo es ligero? (true/false):");
                boolean ligero = Boolean.parseBoolean(ligeroStr);

                nuevoVehiculo = new Hibrido(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible, enchufable, ligero);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de vehículo no válido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        vehiculos.add(nuevoVehiculo);
        JOptionPane.showMessageDialog(null, "Vehículo agregado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(nuevoVehiculo.toString());
    }
}