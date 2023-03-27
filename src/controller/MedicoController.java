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

