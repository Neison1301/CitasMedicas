package Clases;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Usuario {

    private boolean genero;
    private List<Cita> historialCitas;

    public Paciente() {
        this.historialCitas = new ArrayList<>();
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }

    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void mostrarPerfil() {
        // Implementación del perfil
    }

    public List<Cita> getHistorialCitas() {
        return historialCitas;
    }

    public void agregarCita(Cita cita) {
        this.historialCitas.add(cita);
    }

}
