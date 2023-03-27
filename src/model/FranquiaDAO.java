package model;

import java.util.ArrayList;
import java.util.List;

public class FranquiaDAO {
    private List<Franquia> franquias = new ArrayList<>();
    private int nextId = 1;

    // métodos CRUD

    public List<Franquia> getAll() {
        return franquias;
    }

    public Franquia getById(int id) {
        for (Franquia franquia : franquias) {
            if (franquia.getId() == id) {
                return franquia;
            }
        }
        return null;
    }

    public void create(Franquia franquia) {
        franquia.setId(nextId++);
        franquias.add(franquia);
    }

    public void update(Franquia franquia) {
        for (int i = 0; i < franquias.size(); i++) {
            if (franquias.get(i).getId() == franquia.getId()) {
                franquias.set(i, franquia);
                return;
            }
        }
    }

    public void delete(int id) {
        franquias.removeIf(franquia -> franquia.getId() == id);
    }
}
