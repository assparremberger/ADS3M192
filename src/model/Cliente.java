package model;
/**
 *
 * @author assparremberger
 */
public class Cliente {
    
    public static final int PESSOA_FISICA = 0;
    public static final int PESSOA_JURIDICA = 1;
   
    private int id;
    private String nome, email;
    private Cidade cidade;
    private boolean receberEmail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public boolean isReceberEmail() {
        return receberEmail;
    }

    public void setReceberEmail(boolean receberEmail) {
        this.receberEmail = receberEmail;
    }
    
    
    
}










