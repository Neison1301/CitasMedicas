package CInterfaz;

import java.util.List;

public interface CRUD <T> {

    void agregar(T t);

    void actualizar(T t);

    void eliminar(int id);

    T obtenerPorId(int id);

    List<T> obtenerTodos();

}
