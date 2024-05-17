package Clases;

import java.util.Date;

public class Cita {

    private int idCita;
    private int idPaciente;
    private int idDoctor;
    private Date fechaCita;
    private String horaCita;
    private String tipoConsulta;
    private String notas;

    public Cita(int idCita, int idPaciente, int idDoctor, Date fechaCita, String horaCita, String tipoConsulta) {
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.tipoConsulta = tipoConsulta;
    }

    public int getIdCita() {
        return idCita;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public String getNotas() {
        return notas;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    
}
