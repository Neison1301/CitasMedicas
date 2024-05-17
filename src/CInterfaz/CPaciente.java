/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CInterfaz;

import Clases.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NEISON
 */
public class CPaciente {

    public class PacienteDAO implements CRUD<Paciente> {

        private List<Paciente> pacientes = new ArrayList<>();

        public List<Paciente> getPacientes() {
            return pacientes;
        }

        public void setPacientes(List<Paciente> pacientes) {
            this.pacientes = pacientes;
        }

        @Override
        public void agregar(Paciente paciente) {
            pacientes.add(paciente);
        }

        @Override
        public void actualizar(Paciente paciente) {


        }

        @Override
        public void eliminar(int id) {
            pacientes.removeIf(p -> p.getId() == id);
        }

        @Override
        public Paciente obtenerPorId(int id) {
            return pacientes.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        }

        @Override
        public List<Paciente> obtenerTodos() {
            return pacientes;
        }
    }

}
