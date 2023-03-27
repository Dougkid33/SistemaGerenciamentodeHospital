package model;

public class HorarioAgendaMedico {
    private int id;
    private String diaHorario;
    private String estado;
    private Medico medico;
    private Unidade unidade;
    private String dataCriacao;
    private String dataModificacao;

    // getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiaHorario() {
        return diaHorario;
    }

    public void setDiaHorario(String diaHorario) {
        this.diaHorario = diaHorario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(String dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
}

