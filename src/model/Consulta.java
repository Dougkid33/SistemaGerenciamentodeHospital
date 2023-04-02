package model;

public class Consulta {
    private int id;
    private HorarioAgendaMedico horarioAgenda;
    private Pessoa paciente;
    private String estado;
    private double valor;
    private String dataCriacao;
    private String dataModificacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HorarioAgendaMedico getHorarioAgenda() {
        return horarioAgenda;
    }

    public void setHorarioAgenda(HorarioAgendaMedico horarioAgenda) {
        this.horarioAgenda = horarioAgenda;
    }

    public Pessoa getPaciente() {
        return paciente;
    }

    public void setPaciente(Pessoa paciente) {
        this.paciente = paciente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
