package control;

public class Clientes {
    private int CPF;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    Clientes umCliente;  
    
    public Clientes(int CPF, String nome, String endereco, int telefone, String email){
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) throws ExcecaoClientes {
            this.CPF = CPF;
        
        System.out.println("CPF atualizado com sucesso");
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}