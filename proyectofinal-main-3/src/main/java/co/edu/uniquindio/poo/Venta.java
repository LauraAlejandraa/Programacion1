package co.edu.uniquindio.poo;


public class Venta extends Transaccion{

    public Venta( Cliente cliente, Vehiculo vehiculo,Empleado empleado,String fecha) {
        super(fecha, empleado, cliente, vehiculo);
        
    }

    @Override
    public String toString() {
        return "Venta: "+super.toString();
    }

    
}