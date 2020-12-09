// Classe para Atributos e Metodos GET/SET.
import java.util.Date;

// Classe extends Classe.
// Classe implements Interface.

public class Dados_Email implements Email{
    // Atributos Particulares. 
    // private <tipo> e <nomeDoAtributo>;
    private Date dataAtual;
    private String nome;
    private String email;
    private String telefone;
    
    // Data Atual.
    public Date getDataAtual(){
        return dataAtual;
    }
    public void setDataAtual(Date dataAtual){
        this.dataAtual = dataAtual;
    }
    
    // Nome.
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // Email.
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    // Telefone.
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}