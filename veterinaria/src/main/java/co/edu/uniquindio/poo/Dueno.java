package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Dueno {
    private String nombre;
    private String edad;
     private LinkedList<Mascota> mascotas;

    public Dueno (String nombre, String edad){
        this.nombre=nombre;
        this.edad=edad;
        mascotas = new LinkedList<>();

    }
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setMascotas(LinkedList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Dueno [nombre=" + nombre + ", edad=" + edad + ", mascotas=" + mascotas + "]";
    }
    
    
}
