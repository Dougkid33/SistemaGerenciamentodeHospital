<<<<<<< HEAD
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
=======
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
>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
