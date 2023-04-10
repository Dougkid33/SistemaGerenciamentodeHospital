<<<<<<< HEAD
package model;

public class FranquiaDAO {
    private Franquia[] franquias = new Franquia[100];
    private int nextId = 1;
    private int count = 0;

    // métodos CRUD

    public Franquia[] buscarTodas() {
        return franquias;
    }

    public Franquia buscarFranquia(int id) {
        for (int i = 0; i < count; i++) {
            if (franquias[i].getId() == id) {
                return franquias[i];
            }
        }
        return null;
    }

    public void criarFranquia(Franquia franquia) {
        franquia.setId(nextId++);
        franquias[count++] = franquia;
    }

    public void editarFranquia(Franquia franquia) {
        for (int i = 0; i < count; i++) {
            if (franquias[i].getId() == franquia.getId()) {
                franquias[i] = franquia;
                return;
            }
        }
    }

    public void deletarFranquia(int id) {
        for (int i = 0; i < count; i++) {
            if (franquias[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    franquias[j] = franquias[j + 1];
                }
                franquias[count - 1] = null;
                count--;
                return;
            }
        }
    }
}
=======
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
>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
