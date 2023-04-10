package controller;

import model.FinanceiroADM;
import model.FinanceiroADMDAO;

public class FinanceiroADMController {
	private FinanceiroADMDAO dao;

    public FinanceiroADMController() {
        this.dao = new FinanceiroADMDAO();
    }

    public void cadastrar(FinanceiroADM financeiro) {
        dao.cadastrar(financeiro);
    }

    public void atualizar(FinanceiroADM financeiro) {
        dao.atualizar(financeiro);
    }

    public void excluir(int id) {
        dao.excluir(id);
    }

    public FinanceiroADM[] buscarTodos() {
        return dao.buscarTodos();
    }

    public FinanceiroADM buscarPorId(int id) {
        return dao.buscarPorId(id);
    }
}
