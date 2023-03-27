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
