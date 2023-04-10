package model;

import java.time.LocalDateTime;

public class MovimentoFinanceiro {
	private int id;
	private String tipoMovimento;
	private String franquia;
	private String unidade;
	private String descritivoMovimento;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataModificacao;

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

	public String getFranquia() {
		return franquia;
	}

	public void setFranquia(String franquia) {
		this.franquia = franquia;
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

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(LocalDateTime dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public MovimentoFinanceiro(int id, String tipoMovimento, String franquia, String unidade,
			String descritivoMovimento, LocalDateTime dataCriacao, LocalDateTime dataModificacao) {
		super();
		this.id = id;
		this.tipoMovimento = tipoMovimento;
		this.franquia = franquia;
		this.unidade = unidade;
		this.descritivoMovimento = descritivoMovimento;
		this.dataCriacao = dataCriacao;
		this.dataModificacao = dataModificacao;
	}

	// getters e setters

}
