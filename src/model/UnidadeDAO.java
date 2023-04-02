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
