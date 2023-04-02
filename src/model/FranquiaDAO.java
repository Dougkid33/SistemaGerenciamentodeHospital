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
