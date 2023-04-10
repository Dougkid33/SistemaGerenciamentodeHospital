<<<<<<< HEAD
package controller;

import java.util.Date;


import model.Medico;
import model.Pessoa;

public class MedicoController {
    private Medico[] medicos;
    private int indice = 0;

    public MedicoController(int tamanho) {
        this.medicos = new Medico[tamanho];
    }

    public void cadastrarMedico(String nome, String cpf, String telefone, String especialidade) {
        Pessoa pessoa = new Pessoa(0, nome, cpf, telefone, especialidade, especialidade, especialidade, especialidade, null, null);
        Medico medico = new Medico(this.indice + 1, pessoa, especialidade, new Date(), new Date());
        this.medicos[this.indice] = medico;
        this.indice++;
    }

    public void atualizarMedico(int id, String nome, String cpf, String telefone, String especialidade) {
        for (int i = 0; i < this.indice; i++) {
            if (this.medicos[i].getId() == id) {
                this.medicos[i].getPessoa().setNome(nome);
                this.medicos[i].getPessoa().setCpf(cpf);
                this.medicos[i].getPessoa().setTelefone(telefone);
                this.medicos[i].setEspecialidade(especialidade);
                this.medicos[i].setDataModificacao(new Date());
                break;
            }
        }
    }

    public void excluirMedico(int id) {
        for (int i = 0; i < this.indice; i++) {
            if (this.medicos[i].getId() == id) {
                for (int j = i; j < this.indice - 1; j++) {
                    this.medicos[j] = this.medicos[j + 1];
                }
                this.medicos[this.indice - 1] = null;
                this.indice--;
                break;
            }
        }
    }

    public Medico buscarporID(int id) {
        for (int i = 0; i < this.indice; i++) {
            if (this.medicos[i].getId() == id) {
                return this.medicos[i];
            }
        }
        return null;
    }

    public Medico[] listarMedicos() {
        Medico[] resultado = new Medico[this.indice];
        for (int i = 0; i < this.indice; i++) {
            resultado[i] = this.medicos[i];
        }
        return resultado;
    }
}
=======
package controller;

import java.util.Date;
import java.util.List;

import model.Medico;
import model.MedicoDAO;
import model.Pessoa;

public class MedicoController {
    private MedicoDAO dao;

    public MedicoController() {
        this.dao = new MedicoDAO();
    }

    public void cadastrarMedico(String nome, String cpf, String telefone, String especialidade) {
        Pessoa pessoa = new Pessoa(0, nome, cpf, telefone, especialidade, especialidade, especialidade, especialidade, null, null);
        Medico medico = new Medico(0, pessoa, especialidade, new Date(), new Date());
        this.dao.cadastrar(medico);
    }

    public void atualizarMedico(int id, String nome, String cpf, String telefone, String especialidade) {
        Medico medico = this.dao.buscarPorId(id);
        if (medico != null) {
            medico.getPessoa().setNome(nome);
            medico.getPessoa().setCpf(cpf);
            medico.getPessoa().setTelefone(telefone);
            medico.setEspecialidade(especialidade);
            medico.setDataModificacao(new Date());
            this.dao.atualizar(medico);
        }
    }

    public void excluirMedico(int id) {
        this.dao.excluir(id);
    }
    
    
    public Medico buscarporID(int id) {
    	return dao.buscarPorId(id);
    }

    public List<Medico> listarMedicos() {
        return this.dao.listar();
    }


	
}

>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
