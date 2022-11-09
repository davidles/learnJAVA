package exercises.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    List <String> coches = new ArrayList<String>();
    @Override
    public List save(String marcaModelo) {
        coches.add(marcaModelo);
        return coches;
    }

    @Override
    public List findAll() {
        return coches;
    }

    @Override
    public List delete(String marcaModelo) {
        coches.remove(marcaModelo);

        return coches;

    }
}
