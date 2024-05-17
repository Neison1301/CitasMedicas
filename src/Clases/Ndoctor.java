package Clases;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ndoctor extends CitasMedicas {
    private String registrodoctor = "C:\\Users\\NEISON\\Downloads\\CitasMedicas-master\\src\\Almacenamiento\\RegistroDoctor.txt";

    private int cantidadActual;
    private int[] idDoctor;
    private String[] nombreDoctor;
    private String[] apellidoDoctor;
    private String[] telefonoDoctor;
    private String[] emailDoctor;
    private boolean[] generoDoctor;
    private String[] especialidadDoctor;

    public Ndoctor(int maxDoctores) {
        this.cantidadActual = 0;
        this.idDoctor = new int[maxDoctores];
        this.nombreDoctor = new String[maxDoctores];
        this.apellidoDoctor = new String[maxDoctores];
        this.telefonoDoctor = new String[maxDoctores];
        this.emailDoctor = new String[maxDoctores];
        this.generoDoctor = new boolean[maxDoctores];
        this.especialidadDoctor = new String[maxDoctores];
    }

    public String getRegistrodoctor() {
        return registrodoctor;
    }

    public void setRegistrodoctor(String registrodoctor) {
        this.registrodoctor = registrodoctor;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int[] getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int[] idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String[] getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String[] nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String[] getApellidoDoctor() {
        return apellidoDoctor;
    }

    public void setApellidoDoctor(String[] apellidoDoctor) {
        this.apellidoDoctor = apellidoDoctor;
    }

    public String[] getTelefonoDoctor() {
        return telefonoDoctor;
    }

    public void setTelefonoDoctor(String[] telefonoDoctor) {
        this.telefonoDoctor = telefonoDoctor;
    }

    public String[] getEmailDoctor() {
        return emailDoctor;
    }

    public void setEmailDoctor(String[] emailDoctor) {
        this.emailDoctor = emailDoctor;
    }

    public boolean[] getGeneroDoctor() {
        return generoDoctor;
    }

    public void setGeneroDoctor(boolean[] generoDoctor) {
        this.generoDoctor = generoDoctor;
    }

    public String[] getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(String[] especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public String getRegistroArchivo() {
        return registroArchivo;
    }

    public void setRegistroArchivo(String registroArchivo) {
        this.registroArchivo = registroArchivo;
    }


    public void agregarDoctor(int id, String nombre, String apellido, String telefono, String email, boolean genero, String especialidad) {
        if (cantidadActual < idDoctor.length) {
            idDoctor[cantidadActual] = id;
            nombreDoctor[cantidadActual] = nombre;
            apellidoDoctor[cantidadActual] = apellido;
            telefonoDoctor[cantidadActual] = telefono;
            emailDoctor[cantidadActual] = email;
            generoDoctor[cantidadActual] = genero;
            especialidadDoctor[cantidadActual] = especialidad;
            cantidadActual++;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más doctores, límite alcanzado.");
        }
    }

    @Override
    public void escribirDatosEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(registrodoctor, true))) {
            for (int i = 0; i < cantidadActual; i++) {
                writer.write(String.format("%d, %s, %s, %s, %s, %s, %s%n", idDoctor[i], nombreDoctor[i], apellidoDoctor[i],
                        telefonoDoctor[i], emailDoctor[i], generoDoctor[i] ? "Masculino" : "Femenino", especialidadDoctor[i]));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
