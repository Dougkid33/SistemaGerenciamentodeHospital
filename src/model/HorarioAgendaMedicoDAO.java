<<<<<<< HEAD
package model;

public class HorarioAgendaMedicoDAO {
    private HorarioAgendaMedico[] horarios = new HorarioAgendaMedico[10];
    private int nextId = 1;

    // métodos CRUD

    public HorarioAgendaMedico[] listarTodos() {
        return horarios;
    }

    public HorarioAgendaMedico listarHorarioAM(int id) {
        for (HorarioAgendaMedico horario : horarios) {
            if (horario != null && horario.getId() == id) {
                return horario;
            }
        }
        return null;
    }

    public void criarAgendaMedico(HorarioAgendaMedico horario) {
        horario.setId(nextId++);
        for (int i = 0; i < horarios.length; i++) {
            if (horarios[i] == null) {
                horarios[i] = horario;
                break;
            }
        }
    }

    public void editarAgendaMedico(HorarioAgendaMedico horario) {
        for (int i = 0; i < horarios.length; i++) {
            if (horarios[i] != null && horarios[i].getId() == horario.getId()) {
                horarios[i] = horario;
                return;
            }
        }
    }

    public void deletarAgendaMedico(int id) {
        for (int i = 0; i < horarios.length; i++) {
            if (horarios[i] != null && horarios[i].getId() == id) {
                horarios[i] = null;
                return;
            }
        }
    }
}
=======
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
>>>>>>> d018c5d3a54d9dbe98f76e54ed226eac2b7d629a
