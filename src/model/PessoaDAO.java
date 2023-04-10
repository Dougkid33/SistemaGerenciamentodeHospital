<<<<<<< HEAD
package model;

import java.util.Date;

public class PessoaDAO {
    private Pessoa[] pessoas;
    private int contadorPessoas;

    public PessoaDAO() {
        this.pessoas = new Pessoa[100];
        this.contadorPessoas = 0;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoa.setId(contadorPessoas + 1);
        pessoa.setDataCriacao(new Date());
        pessoa.setDataModificacao(new Date());
        this.pessoas[contadorPessoas] = pessoa;
        contadorPessoas++;
    }

    public void atualizarPessoa(Pessoa pessoa) {
        for (int i = 0; i < contadorPessoas; i++) {
            if (pessoas[i].getId() == pessoa.getId()) {
                pessoas[i] = pessoa;
                pessoa.setDataModificacao(new Date());
                break;
            }
        }
    }

    public void removerPessoa(int id) {
        for (int i = 0; i < contadorPessoas; i++) {
            if (pessoas[i].getId() == id) {
                pessoas[i] = null;
                // Shift das pessoas no array para preencher o espaço vazio
                for (int j = i; j < contadorPessoas - 1; j++) {
                    pessoas[j] = pessoas[j+1];
                }
                contadorPessoas--;
                break;
            }
        }
    }

    public Pessoa obterPessoa(int id) {
        for (int i = 0; i < contadorPessoas; i++) {
            if (pessoas[i].getId() == id) {
                return pessoas[i];
            }
        }
        return null;
    }

    public Pessoa[] listarPessoas() {
        Pessoa[] pessoasExistentes = new Pessoa[contadorPessoas];
        for (int i = 0; i < contadorPessoas; i++) {
            pessoasExistentes[i] = pessoas[i];
        }
        return pessoasExistentes;
    }
}
=======
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
>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
