package trabalho.poo.controller;

import java.util.Calendar;

public class Atividade {
	
	private Long codAtividade;
	private Calendar dataIni;
	private Calendar dataFim;
	
	
	public Long getCodAtividade() {
		return codAtividade;
	}
	public void setCodAtividade(Long codAtividade) {
		this.codAtividade = codAtividade;
	}
	public Calendar getDataIni() {
		return dataIni;
	}
	public void setDataIni(Calendar dataIni) {
		this.dataIni = dataIni;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	
	

}
