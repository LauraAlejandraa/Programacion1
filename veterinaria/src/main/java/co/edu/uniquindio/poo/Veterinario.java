package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Veterinario {
    private String nombre;
    private String numLicencia;
    private LinkedList<Mascota> mascotas;

    public Veterinario (String nombre, String numLicencia){
        this.nombre=nombre;
        this.numLicencia=numLicencia;
        mascotas = new LinkedList<>();
    }
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public void setMascotas(LinkedList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Veterinario [nombre=" + nombre + ", numLicencia=" + numLicencia + ", mascotas=" + mascotas + "]";
    }
    

}
