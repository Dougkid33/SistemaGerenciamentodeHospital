package model;

import java.util.Date;

public class FinanceiroMedico {
    private int id;
    private double valorMedico;
    private String estado;
    private double franquia;
    private Date dataCriacao;
    private Date dataModificacao;
    private String descritivoMovimento;
    private Medico medico;
    
    

	public FinanceiroMedico(int id, double valorMedico, String estado, double franquia, Date dataCriacao,
			Date dataModificacao, String descritivoMovimento, Medico medico) {
		super();
		this.id = id;
		this.valorMedico = valorMedico;
		this.estado = estado;
		this.franquia = franquia;
		this.dataCriacao = dataCriacao;
		this.dataModificacao = dataModificacao;
		this.descritivoMovimento = descritivoMovimento;
		this.medico = medico;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorMedico() {
		return valorMedico;
	}
	public void setValorMedico(double valorMedico) {
		this.valorMedico = valorMedico;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getFranquia() {
		return franquia;
	}
	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataModificacao() {
		return dataModificacao;
	}
	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	public String getDescritivoMovimento() {
		return descritivoMovimento;
	}
	public void setDescritivoMovimento(String descritivoMovimento) {
		this.descritivoMovimento = descritivoMovimento;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

 
    
    
}
