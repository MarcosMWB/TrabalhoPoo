package trabalho.poo.controller;

public class Projeto {
	
	   private int cod;
	   private Clientes cpf;
	   private float dataIni;
	   private float dataFim;
	   private float valor;
	   private static int cont;
	   
	    public Projeto(Clientes CPF, float dataIni, float dataFim){
	        this.cod = ++cont;
	        this.cpf = CPF;
	        this.dataIni = dataIni;
	        this.dataFim = dataFim;
	        this.valor = (this.dataFim - this.dataIni)* 150;
	    }

	    public int getCod() {
	        return cod;
	    }

	    public void setCod(int cod) {
	        this.cod = cod;
	    }

	    public void getCpf(){
	        cpf.getCPF();
	    }

	    public void setCpf(Clientes cpf) {
	        this.cpf = cpf;
	    }

	    public float getDataIni() {
	        return dataIni;
	    }

	    public void setDataIni(float dataIni) {
	        this.dataIni = dataIni;
	    }

	    public float getDataFim() {
	        return dataFim;
	    }

	    public void setDataFim(float dataFim) {
	        this.dataFim = dataFim;
	    }

	    public float getValor() {
	        return valor;
	    }

	    public void setValor(float valor) {
	        this.valor = (this.dataFim - this.dataIni) * valor;
	    }
	    
	    
	}