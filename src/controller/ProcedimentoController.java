package controller;

import model.Consulta;
import model.Procedimento;
import model.ProcedimentoDAO;

public class ProcedimentoController {
    private ProcedimentoDAO dao;

    public ProcedimentoController() {
        dao = new ProcedimentoDAO();
    }

    public void adicionarProcedimento(Procedimento procedimento) {
        dao.adicionar(procedimento);
    }

    public Procedimento[] listarProcedimentos() {
        return dao.listar();
    }

    public Procedimento buscarProcedimentoPorId(int id) {
        return dao.buscarPorId(id);
    }

    public Procedimento[] buscarProcedimentosPorConsulta(Consulta consulta) {
        return dao.buscarPorConsulta(consulta);
    }

    public void atualizarProcedimento(Procedimento procedimentoAtualizado) {
        dao.atualizar(procedimentoAtualizado);
    }

    public void removerProcedimento(Procedimento procedimento) {
        dao.remover(procedimento);
    }
}
