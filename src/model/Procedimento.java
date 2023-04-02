package model;

import java.time.LocalDateTime;

public class Procedimento {
    private int id;
    private String nome;
    private Consulta consulta;
    private String diaHorario;
    private String estado;
    private double valor;
    private String laudo;
    private String dataCriacao;
    private String dataModificacao;
    
    public Procedimento(int id, String nome, Consulta consulta, String diaHorario, String estado, double valor, String laudo, String dataCriacao, String dataModificacao) {
        this.id = id;
        this.nome = nome;
        this.consulta = consulta;
        this.diaHorario = diaHorario;
        this.estado = estado;
        this.valor = valor;
        this.laudo = laudo;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
    }
    
    // getters e setters
    
    public Procedimento(int id2, String nome2, Consulta consulta2, LocalDateTime diaHorario2, String estado2,
			double valor2, LocalDateTime dataCriacao2, LocalDateTime dataModificacao2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Consulta getConsulta() {
        return consulta;
    }
    
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
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
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getLaudo() {
        return laudo;
    }
    
    public void setLaudo(String laudo) {
        this.laudo = laudo;
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
