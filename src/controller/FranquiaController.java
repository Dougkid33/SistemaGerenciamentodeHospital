package controller;

import model.Franquia;
import model.FranquiaDAO;

public class FranquiaController {
    private FranquiaDAO dao = new FranquiaDAO();

    // métodos CRUD

    public Franquia[] buscarTodas() {
        return dao.buscarTodas();
    }

    public Franquia buscarFranquia(int id) {
        return dao.buscarFranquia(id);
    }

    public void criarFranquia(Franquia franquia) {
        dao.criarFranquia(franquia);
    }

    public void editarFranquia(Franquia franquia) {
        dao.editarFranquia(franquia);
    }

    public void deletarFranquia(int id) {
        dao.deletarFranquia(id);
    }
}
