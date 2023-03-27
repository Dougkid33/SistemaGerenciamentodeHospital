package model;

import java.util.ArrayList;
import java.util.List;

public class UnidadeDAO {
    private List<Unidade> unidades = new ArrayList<>();
    private int nextId = 1;

    // métodos CRUD

    public List<Unidade> getAll() {
        return unidades;
    }

    public Unidade getById(int id) {
        for (Unidade unidade : unidades) {
            if (unidade.getId() == id) {
                return unidade;
            }
        }
        return null;
    }

    public void create(Unidade unidade) {
        unidade.setId(nextId++);
        unidades.add(unidade);
    }

    public void update(Unidade unidade) {
        for (int i = 0; i < unidades.size(); i++) {
            if (unidades.get(i).getId() == unidade.getId()) {
                unidades.set(i, unidade);
                return;
            }
        }
    }

    public void delete(int id) {
        unidades.removeIf(unidade -> unidade.getId() == id);
    }
}
