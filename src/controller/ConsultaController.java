package controller;

import model.Consulta;
import model.ConsultaDAO;

public class ConsultaController {
    private ConsultaDAO dao;

    public ConsultaController() {
        dao = new ConsultaDAO();
    }

    public Consulta[] listarTodas() {
        return dao.listarTodas();
    }

    public Consulta listarConsulta(int id) {
        return dao.listarConsulta(id);
    }

    public void criarConsulta(Consulta consulta) {
        dao.criarConsulta(consulta);
    }

    public void editarConsulta(Consulta consulta) {
        dao.editarConsulta(consulta);
    }

    public void deletarConsulta(int id) {
        dao.deletarConsulta(id);
    }
}
