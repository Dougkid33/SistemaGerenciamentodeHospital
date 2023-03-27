package controller;

import java.util.List;

import model.HorarioAgendaMedico;
import model.HorarioAgendaMedicoDAO;

public class HorarioAgendaMedicoController {
    private HorarioAgendaMedicoDAO dao = new HorarioAgendaMedicoDAO();

    // métodos CRUD

    public List<HorarioAgendaMedico> getAll() {
        return dao.getAll();
    }

    public HorarioAgendaMedico getById(int id) {
    	return dao.getById(id);
    }
    
    public void create(HorarioAgendaMedico horario) {
        dao.create(horario);
    }

    public void update(HorarioAgendaMedico horario) {
        dao.update(horario);
    }

    public void delete(int id) {
        dao.delete(id);
    }

}

