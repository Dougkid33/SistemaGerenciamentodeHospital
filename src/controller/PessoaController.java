
package controller;

import java.util.Date;

import model.Pessoa;
import model.PessoaDAO;

public class PessoaController {
    private PessoaDAO pessoaDAO;

    public PessoaController() {
        this.pessoaDAO = new PessoaDAO();
    }

    public void adicionarPessoa(String nome, String endereco, String cpf, String telefone, String login, String senha, String tipoUsuario) {
        Pessoa pessoa = new Pessoa(0, nome, endereco, cpf, telefone, login, senha, tipoUsuario, new Date(), new Date());
        this.pessoaDAO.adicionarPessoa(pessoa);
    }

    public void atualizarPessoa(int id, String nome, String endereco, String cpf, String telefone, String login, String senha, String tipoUsuario) {
        Pessoa pessoa = new Pessoa(id, nome, endereco, cpf, telefone, login, senha, tipoUsuario, new Date(), new Date());
        this.pessoaDAO.atualizarPessoa(pessoa);
    }

    public void removerPessoa(int id) {
        this.pessoaDAO.removerPessoa(id);
    }

    public Pessoa obterPessoa(int id) {
        return this.pessoaDAO.obterPessoa(id);
    }

    public Pessoa[] listarPessoas() {
        return this.pessoaDAO.listarPessoas();
    }
}

