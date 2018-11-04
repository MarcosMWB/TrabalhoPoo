package control;

public class Funcionario {
    private int cod;
    private String nome;
    private int telefone;
    private String endereco;
    private static int cont = 0;

    public Funcionario(String nome, int telefone, String endereco) {
        this.cod = ++cont;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}