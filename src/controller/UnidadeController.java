package controller;

import java.util.List;

import model.Unidade;
import model.UnidadeDAO;

public class UnidadeController {
    private UnidadeDAO dao = new UnidadeDAO();

    // métodos CRUD

    public List<Unidade> getAll() {
        return dao.getAll();
    }

    public Unidade getById(int id) {
        return dao.getById(id);
    }

    public void create(Unidade unidade) {
        dao.create(unidade);
    }

    public void update(Unidade unidade) {
        dao.update(unidade);
    }

    public void delete(int id) {
        dao.delete(id);
    }
}

