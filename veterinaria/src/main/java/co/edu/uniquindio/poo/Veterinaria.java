package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    private LinkedList<Mascota> mascotas;
    private LinkedList<Veterinario> veterinarios;

    public Veterinaria (String nombre, String direccion, String telefono){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        mascotas = new LinkedList<>();
        veterinarios = new LinkedList<>();
    }
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void agregarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }

    public LinkedList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMascotas(LinkedList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setVeterinarios(LinkedList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    @Override
    public String toString() {
        return "La Veterinaria "+ nombre + ", con direccion " + direccion + ", telefono " + telefono + ", mascotas="
                + mascotas + ", veterinarios=" + veterinarios + "]";
    }

    
    
}
