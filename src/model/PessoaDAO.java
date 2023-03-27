package model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PessoaDAO {
    private List<Pessoa> pessoas;

    public PessoaDAO() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoa.setId(pessoas.size() + 1);
        pessoa.setDataCriacao(new Date());
        pessoa.setDataModificacao(new Date());
        this.pessoas.add(pessoa);
    }

    public void atualizarPessoa(Pessoa pessoa) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == pessoa.getId()) {
                pessoas.set(i, pessoa);
                pessoa.setDataModificacao(new Date());
                break;
            }
        }
    }
    

    public void removerPessoa(int id) {
    	for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoas.remove(pessoa);
                break;
            }
        }
    }

    public Pessoa obterPessoa(int id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }

    public List<Pessoa> listarPessoas() {
        return this.pessoas;
    }
}
