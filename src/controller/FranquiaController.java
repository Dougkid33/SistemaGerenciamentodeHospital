package controller;

import java.util.List;

import model.Franquia;
import model.FranquiaDAO;

public class FranquiaController {
    private FranquiaDAO dao = new FranquiaDAO();

    // métodos CRUD

    public List<Franquia> getAll() {
        return dao.getAll();
    }

    public Franquia getById(int id) {
        return dao.getById(id);
    }

    public void create(Franquia franquia) {
        dao.create(franquia);
    }
    
}
