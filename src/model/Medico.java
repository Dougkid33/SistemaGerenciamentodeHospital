package model;

import java.util.Date;

public class Medico {
	 private int id;
	 private Pessoa pessoa;
	 private String especialidade;
	 private Date dataCriacao;
	 private Date dataModificacao;
	public Medico(int id, Pessoa pessoa, String especialidade, Date dataCriacao, Date dataModificacao) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.especialidade = especialidade;
		this.dataCriacao = dataCriacao;
		this.dataModificacao = dataModificacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
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
	 
	 
}
