package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class HistoralMedico {
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;

    public HistoralMedico (LocalDate fecha, String diagnostico, String tratamiento, String observaciones){
        this.fecha=fecha;
        this.diagnostico=diagnostico;
        this.tratamiento=tratamiento;
        this.observaciones=observaciones;
        
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "HistoralMedico [fecha=" + fecha + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento
                + ", observaciones=" + observaciones + "]";
    }
    
    
}
