package model;

import java.util.ArrayList;
import java.util.List;

public class HorarioAgendaMedicoDAO {
    private List<HorarioAgendaMedico> horarios = new ArrayList<>();
    private int nextId = 1;

    // métodos CRUD

    public List<HorarioAgendaMedico> getAll() {
        return horarios;
    }

    public HorarioAgendaMedico getById(int id) {
        for (HorarioAgendaMedico horario : horarios) {
            if (horario.getId() == id) {
                return horario;
            }
        }
        return null;
    }

    public void create(HorarioAgendaMedico horario) {
        horario.setId(nextId++);
        horarios.add(horario);
    }

    public void update(HorarioAgendaMedico horario) {
        for (int i = 0; i < horarios.size(); i++) {
            if (horarios.get(i).getId() == horario.getId()) {
                horarios.set(i, horario);
                return;
            }
        }
    }

    public void delete(int id) {
        horarios.removeIf(horario -> horario.getId() == id);
    }
}
