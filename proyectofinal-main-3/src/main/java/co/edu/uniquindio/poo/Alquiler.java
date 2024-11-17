package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Alquiler extends Transaccion{
    private int diasAlquiler ;
    
    
    public Alquiler( Cliente cliente,Vehiculo vehiculo, Empleado empleado, String fecha) {
        super(fecha, empleado, cliente, vehiculo);

    }

    @Override
    public String toString() {
        return "Alquiler: "+super.toString()+ ", diasAlquiler=" + diasAlquiler;
    }

    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }
    

}