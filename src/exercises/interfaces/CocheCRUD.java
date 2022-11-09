package exercises.interfaces;

/*
Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

Ejemplo:

CocheCRUD cocheCrud = new CocheCRUDImpl()
 */

import java.util.Arrays;
import java.util.List;

public interface CocheCRUD {

    public List save(String marcaModelo);

    public List findAll();

    public List delete(String marcaModelo);


}
