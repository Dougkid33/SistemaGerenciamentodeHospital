package model;

import java.util.Date;

public class FinanceiroADM {
    private int id;
    private String tipoMovimento;
    private double valor;
    private String unidade;
    private String descritivoMovimento;
    private Date dataCriacao;
    private Date dataModificacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoMovimento() {
		return tipoMovimento;
	}
	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getDescritivoMovimento() {
		return descritivoMovimento;
	}
	public void setDescritivoMovimento(String descritivoMovimento) {
		this.descritivoMovimento = descritivoMovimento;
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

    // getters e setters
    
    
}

