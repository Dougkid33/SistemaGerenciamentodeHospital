<<<<<<< HEAD
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
=======
package model;

import java.util.Date;
import java.util.List;

public class MedicoDAO {
	
	private List<Medico> medicos;
    public void cadastrar(Medico medico) {
        medico.setId(medicos.size() + 1);
        medico.setDataCriacao(new Date());
        medico.setDataModificacao(new Date());
        this.medicos.add(medico);
	}
    public void atualizar(Medico medico) {
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getId() == medico.getId()) {
            	medicos.set(i, medico);
            	medico.setDataModificacao(new Date());
                break;
            }
        }
	}
    public void excluir(int id) {
    	for (Medico medico : medicos) {
            if (medico.getId() == id) {
                medicos.remove(medico);
                break;
            }
        }
	}
    public Medico buscarPorId(int id) {
    	for (Medico medico : medicos) {
            if (medico.getId() == id) {
                return medico;
            }
        }
        return null;
	}
    public List<Medico> listar() {
		return this.medicos;
	}
}
>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
