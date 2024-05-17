package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class NPacientes extends CitasMedicas {
    String registroPaciente = "C:\\Users\\NEISON\\Downloads\\CitasMedicas-master\\src\\Almacenamiento\\RegistroPaciente.txt";

    private int cantidadActual;
    private int[] idPaciente;
    private String[] nombrePaciente;
    private String[] apellidoPaciente;
    private String[] telefonoPaciente;
    private String[] emailPaciente;
    private boolean[] generoPaciente;

    public NPacientes(int maxPacientes) {
        this.cantidadActual = 0;
        this.idPaciente = new int[maxPacientes];
        this.nombrePaciente = new String[maxPacientes];
        this.apellidoPaciente = new String[maxPacientes];
        this.telefonoPaciente = new String[maxPacientes];
        this.emailPaciente = new String[maxPacientes];
        this.generoPaciente = new boolean[maxPacientes];
    }

    public String getRegistroPaciente() {
        return registroPaciente;
    }

    public void setRegistroPaciente(String registroPaciente) {
        this.registroPaciente = registroPaciente;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int[] getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int[] idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String[] getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String[] nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String[] getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String[] apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public String[] getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(String[] telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public String[] getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String[] emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public boolean[] getGeneroPaciente() {
        return generoPaciente;
    }

    public void setGeneroPaciente(boolean[] generoPaciente) {
        this.generoPaciente = generoPaciente;
    }

    public String getRegistroArchivo() {
        return registroArchivo;
    }

    public void setRegistroArchivo(String registroArchivo) {
        this.registroArchivo = registroArchivo;
    }

    public void agregarPaciente(int id, String nombre, String apellido, String telefono, String email, boolean genero) {
        if (cantidadActual < idPaciente.length) {
            idPaciente[cantidadActual] = id;
            nombrePaciente[cantidadActual] = nombre;
            apellidoPaciente[cantidadActual] = apellido;
            telefonoPaciente[cantidadActual] = telefono;
            emailPaciente[cantidadActual] = email;
            generoPaciente[cantidadActual] = genero;
            cantidadActual++;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más pacientes, límite alcanzado.");
        }
    }

    @Override
    public void escribirDatosEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(registroPaciente, true))) {
            for (int i = 0; i < cantidadActual; i++) {
                writer.write(String.format("%d, %s, %s, %s, %s, %s%n", idPaciente[i], nombrePaciente[i], apellidoPaciente[i],
                        telefonoPaciente[i], emailPaciente[i], generoPaciente[i] ? "Masculino" : "Femenino"));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
