import java.util.Date;
import java.io.Serializable;

// Interface
interface Email extends Serializable {
    Date getDataAtual();
    void setDataAtual(Date dataAtual);
    String getNome();
    void setNome(String nome);
    String getEmail();
    void setEmail(String email);
    String getTelefone();
    void setTelefone(String telefone);
}