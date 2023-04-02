package model;

import java.util.Date;

public class MedicoDAO {
	
	private Medico[] medicos;
	private int proximoId;
	
	public MedicoDAO(int tamanhoMaximo) {
		this.medicos = new Medico[tamanhoMaximo];
		this.proximoId = 1;
	}
	
    public void cadastrar(Medico medico) {
        medico.setId(proximoId);
        medico.setDataCriacao(new Date());
        medico.setDataModificacao(new Date());
        this.medicos[proximoId - 1] = medico;
        proximoId++;
	}
    
    public void atualizar(Medico medico) {
        for (int i = 0; i < medicos.length; i++) {
            if (medicos[i] != null && medicos[i].getId() == medico.getId()) {
            	medicos[i] = medico;
            	medico.setDataModificacao(new Date());
                break;
            }
        }
	}
    
    public void excluir(int id) {
    	for (int i = 0; i < medicos.length; i++) {
            if (medicos[i] != null && medicos[i].getId() == id) {
                medicos[i] = null;
                break;
            }
        }
	}
    
    public Medico buscarPorId(int id) {
    	for (Medico medico : medicos) {
            if (medico != null && medico.getId() == id) {
                return medico;
            }
        }
        return null;
	}
    
    public Medico[] listar() {
		return this.medicos;
	}
}
