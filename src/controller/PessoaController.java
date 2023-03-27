package controller;
import java.util.List;

import model.Pessoa;
import model.PessoaDAO;

public class PessoaController {
	private PessoaDAO pessoaDAO;
	public PessoaController() {
	    this.pessoaDAO = new PessoaDAO();
	}

	public void adicionarPessoa(String nome, String endereco, String cpf, String telefone, String login, String senha, String tipoUsuario) {
	    Pessoa pessoa = new Pessoa(0, nome, endereco, cpf, telefone, login, senha, tipoUsuario, null, null);
	    pessoaDAO.adicionarPessoa(pessoa);
	}

	public void atualizarPessoa(int id, String nome, String endereco, String cpf, String telefone, String login, String senha, String tipoUsuario) {
	    Pessoa pessoa = pessoaDAO.obterPessoa(id);
	    if (pessoa != null) {
	        pessoa.setNome(nome);
	        pessoa.setEndereco(endereco);
	        pessoa.setCpf(cpf);
	        pessoa.setTelefone(telefone);
	        pessoa.setLogin(login);
	        pessoa.setSenha(senha);
	        pessoa.setTipoUsuario(tipoUsuario);
	        pessoaDAO.atualizarPessoa(pessoa);
	    }
	}

	public void removerPessoa(int id) {
	    pessoaDAO.removerPessoa(id);
	}

	public Pessoa obterPessoa(int id) {
	    return pessoaDAO.obterPessoa(id);
	}

	public List<Pessoa> listarPessoas() {
	    return pessoaDAO.listarPessoas();
	}

}
