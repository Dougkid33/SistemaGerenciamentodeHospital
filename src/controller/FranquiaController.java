<<<<<<< HEAD
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
=======
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
>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
