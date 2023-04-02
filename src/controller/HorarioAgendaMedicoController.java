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
