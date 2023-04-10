<<<<<<< HEAD
package controller;

import model.Unidade;
import model.UnidadeDAO;

public class UnidadeController {
    private UnidadeDAO dao = new UnidadeDAO();

    public Unidade[] listarTodas() {
        return dao.listarTodas();
    }

    public Unidade listarUnidade(int id) {
        return dao.listarUnidade(id);
    }

    public void criarUnidade(Unidade unidade) {
        dao.criarUnidade(unidade);
    }

    public void editarUnidade(Unidade unidade) {
        dao.editarUnidade(unidade);
    }

    public void deletarUnidade(int id) {
        dao.deletarUnidade(id);
    }
}

=======
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

>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
