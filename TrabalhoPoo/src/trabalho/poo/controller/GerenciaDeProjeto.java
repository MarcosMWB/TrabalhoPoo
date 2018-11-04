package trabalho.poo.controller;

public class GerenciaDeProjeto {

	private Funcionario funcionario;
	private Projeto projeto;
	
	
	public GerenciaDeProjeto(Funcionario funcionario, Projeto projeto) {
		super();
		this.funcionario = funcionario;
		this.projeto = projeto;
	}
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	
	
}
