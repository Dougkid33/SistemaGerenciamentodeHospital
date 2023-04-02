package model;

public class InfoConsultaDAO {
    private InfoConsulta[] infos;
    private int size;
    private static int nextId = 1;

    public InfoConsultaDAO() {
        infos = new InfoConsulta[10];
        size = 0;
    }

    public void criarInfoConsulta(InfoConsulta info) {
        if (size == infos.length) {
            InfoConsulta[] newInfos = new InfoConsulta[infos.length * 2];
            System.arraycopy(infos, 0, newInfos, 0, size);
            infos = newInfos;
        }
        info.setId(nextId++);
        infos[size++] = info;
    }

    public InfoConsulta listarInfoConsulta(int id) {
        for (int i = 0; i < size; i++) {
            if (infos[i].getId() == id) {
                return infos[i];
            }
        }
        return null;
    }

    public InfoConsulta[] listarTodas() {
        InfoConsulta[] allInfos = new InfoConsulta[size];
        System.arraycopy(infos, 0, allInfos, 0, size);
        return allInfos;
    }

    public void editarInfoConsulta(InfoConsulta info) {
        for (int i = 0; i < size; i++) {
            if (infos[i].getId() == info.getId()) {
                infos[i] = info;
                break;
            }
        }
    }

    public void deletarInfoConsulta(int id) {
        for (int i = 0; i < size; i++) {
            if (infos[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    infos[j] = infos[j + 1];
                }
                infos[--size] = null;
                break;
            }
        }
    }
}
