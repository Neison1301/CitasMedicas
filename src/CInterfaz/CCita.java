package CInterfaz;

import Clases.Cita;
import java.util.ArrayList;
import java.util.List;

public class CCita implements CRUD<Cita> {

    private List<Cita> citas = new ArrayList<>();

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    @Override
    public void agregar(Cita cita) {
        citas.add(cita);
    }

    @Override
    public void actualizar(Cita citaActualizada) {
        for (Cita cita : citas) {
            if (cita.getIdCita() == citaActualizada.getIdCita()) {
                // Actualizar los campos de la cita existente con los de la cita actualizada
                cita.setFechaCita(citaActualizada.getFechaCita());
                cita.setHoraCita(citaActualizada.getHoraCita());
                cita.setTipoConsulta(citaActualizada.getTipoConsulta());
                cita.setNotas(citaActualizada.getNotas());
                // No se actualizan los IDs del paciente y del doctor
                return;
            }
        }
    }

    @Override
    public void eliminar(int idCita) {
        citas.removeIf(cita -> cita.getIdCita() == idCita);
    }

    @Override
    public Cita obtenerPorId(int idCita) {
        for (Cita cita : citas) {
            if (cita.getIdCita() == idCita) {
                return cita;
            }
        }
        return null;
    }

    @Override
    public List<Cita> obtenerTodos() {
        return citas;
    }
}
