
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
