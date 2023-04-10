<<<<<<< HEAD
package controller;

import java.util.Arrays;

import model.HorarioAgendaMedico;
import model.HorarioAgendaMedicoDAO;

public class HorarioAgendaMedicoController {
    private HorarioAgendaMedicoDAO dao = new HorarioAgendaMedicoDAO();

    // métodos CRUD

    public HorarioAgendaMedico[] listarTodos() {
        return dao.listarTodos();
    }

    public HorarioAgendaMedico getById(int id) {
        return dao.listarHorarioAM(id);
    }

    public void criarAgendaMedico(HorarioAgendaMedico horario) {
        dao.criarAgendaMedico(horario);
    }

    public void editarAgendaMedico(HorarioAgendaMedico horario) {
        dao.editarAgendaMedico(horario);
    }

    public void deletarAgendaMedico(int id) {
        dao.deletarAgendaMedico(id);
    }
}
=======
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

>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
