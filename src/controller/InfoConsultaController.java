package controller;

import model.InfoConsulta;
import model.InfoConsultaDAO;

public class InfoConsultaController {
    private InfoConsultaDAO dao;

    public InfoConsultaController() {
        dao = new InfoConsultaDAO();
    }

    public void criarInfoConsulta(InfoConsulta info) {
        dao.criarInfoConsulta(info);
    }

    public InfoConsulta listarInfoConsulta(int id) {
        return dao.listarInfoConsulta(id);
    }

    public InfoConsulta[] listarTodas() {
        return dao.listarTodas();
    }

    public void editarInfoConsulta(InfoConsulta info) {
        dao.editarInfoConsulta(info);
    }

    public void deletarInfoConsulta(int id) {
        dao.deletarInfoConsulta(id);
    }
}
