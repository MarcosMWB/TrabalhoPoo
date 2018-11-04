package trabalho.poo.controller;

public class Cargo {
	  private int cod;
	  private String nome;
	  private String descricao;
	  private static int cont = 0;

	    public Cargo(String nome, String descricao) {
	        this.cod = ++cont;
	        this.nome = nome;
	        this.descricao = descricao;
	    }
	    
	    public int getCod() {
	        return cod;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	   
	}