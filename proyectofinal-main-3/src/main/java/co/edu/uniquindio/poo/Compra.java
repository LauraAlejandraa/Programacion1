package co.edu.uniquindio.poo;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Compra extends Transaccion{

    public Compra(Cliente cliente,Vehiculo vehiculo, Empleado empleado,String fecha) {
        super(fecha, empleado, cliente, vehiculo);

    }

    @Override
    public String toString() {
        return "Compra: "+super.toString();
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }

    

}