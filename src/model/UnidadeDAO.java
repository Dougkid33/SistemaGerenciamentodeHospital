<<<<<<< HEAD
package model;

public class UnidadeDAO {
    private Unidade[] unidades = new Unidade[10];
    private int nextId = 1;

    // métodos CRUD

    public Unidade[] listarTodas() {
        return unidades;
    }

    public Unidade listarUnidade(int id) {
        for (Unidade unidade : unidades) {
            if (unidade != null && unidade.getId() == id) {
                return unidade;
            }
        }
        return null;
    }

    public void criarUnidade(Unidade unidade) {
        unidade.setId(nextId++);
        for (int i = 0; i < unidades.length; i++) {
            if (unidades[i] == null) {
                unidades[i] = unidade;
                return;
            }
        }
    }

    public void editarUnidade(Unidade unidade) {
        for (int i = 0; i < unidades.length; i++) {
            if (unidades[i] != null && unidades[i].getId() == unidade.getId()) {
                unidades[i] = unidade;
                return;
            }
        }
    }

    public void deletarUnidade(int id) {
        for (int i = 0; i < unidades.length; i++) {
            if (unidades[i] != null && unidades[i].getId() == id) {
                unidades[i] = null;
                return;
            }
        }
    }
}
=======
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
>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
