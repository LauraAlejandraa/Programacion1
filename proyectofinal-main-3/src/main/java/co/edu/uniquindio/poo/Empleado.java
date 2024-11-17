package co.edu.uniquindio.poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Empleado extends Persona{
    private String usuario;
    private String contraseña;
    private String recuperacionCuenta;
    private LinkedList<Cliente> clientes;
    private LinkedList<Vehiculo> vehiculos;
    private Administrador administrador;

    public Empleado(String nombres, String apellidos, String cedula, String correo, String usuario, String contraseña,
            String recuperacionCuenta, Administrador administrador) {
        super(nombres, apellidos, cedula, correo);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.recuperacionCuenta = recuperacionCuenta;
        this.administrador=administrador;
        clientes=new LinkedList<>();
        vehiculos=new LinkedList<>();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRecuperacionCuenta() {
        return recuperacionCuenta;
    }

    public void setRecuperacionCuenta(String recuperacionCuenta) {
        this.recuperacionCuenta = recuperacionCuenta;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Empleado:"+super.toString()+ ", usuario=" + usuario + ", contraseña=" + contraseña + ", recuperacionCuenta="
                + recuperacionCuenta +", administrador= "+administrador.getNombres()+ "\nclientes=" + clientes + "\nvehiculos=" + vehiculos;
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }
}
