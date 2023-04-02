package controller;


import model.MovimentoFinanceiro;
import model.MovimentoFinanceiroDAO;

public class MovimentoFinanceiroController {
    private MovimentoFinanceiroDAO dao = new MovimentoFinanceiroDAO();

    public void criarMovimentoFinanceiro(MovimentoFinanceiro movimentoFinanceiro) {
        dao.criarMovimentoFInanceiro(movimentoFinanceiro);
    }

    public void atualizar(MovimentoFinanceiro movimentoFinanceiro) {
        dao.atualizarMovimentoFinanceiro(movimentoFinanceiro);
    }

    public void deletar(int id) {
        dao.deletarMovimentoFinanceiro(id);
    }

    public MovimentoFinanceiro buscarMovimentoFinanceiro(int id) {
        return dao.buscarMovimentoFinanceiro(id);
    }

    public MovimentoFinanceiro[] listarTodos() {
        MovimentoFinanceiro[] movimentosFinanceiros = new MovimentoFinanceiro[dao.listarTodos().length];
        for (int i = 0; i < dao.listarTodos().length; i++) {
            movimentosFinanceiros[i] = dao.listarTodos()[i];
        }
        return movimentosFinanceiros;
    }
}
