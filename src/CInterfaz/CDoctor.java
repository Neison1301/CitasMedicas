package CInterfaz;

import Clases.Doctor;
import java.util.ArrayList;
import java.util.List;

public class CDoctor {

    public class DoctorDAO implements CRUD<Doctor> {

        private List<Doctor> doctores = new ArrayList<>();

        @Override
        public void agregar(Doctor doctor) {
            doctores.add(doctor);
        }

        @Override
        public void actualizar(Doctor doctor) {
            // Implementación...
        }

        @Override
        public void eliminar(int id) {
            doctores.removeIf(d -> d.getId() == id);
        }

        @Override
        public Doctor obtenerPorId(int id) {
            return doctores.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
        }

        @Override
        public List<Doctor> obtenerTodos() {
            return doctores;
        }
    }

}
