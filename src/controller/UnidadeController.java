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

