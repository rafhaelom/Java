import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import java.io.*;

public class ManipulaDados {

    public void gravarDados(List<Dados_Email> lst) {
        try {
            System.out.println("Gravando os Dados");
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("dadosEmail.arq"));
            for (Dados_Email de : lst) {
                oos.writeObject(de);
            }
            oos.flush();
            oos.close();
        } catch (IOException e) {
            System.out.println("Erro G: " + e.getMessage());
        }
    }
    
    public List<Dados_Email> lerDados() {
        List<Dados_Email> lst = new ArrayList<>();
        System.out.println("Retornando os Dados");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                new FileInputStream("dadosEmail.arq"));
            Object obj;
            do {
                obj = ois.readObject();
                Dados_Email de = (Dados_Email)obj;
                lst.add(de);
            } while (true);
        } catch (ClassNotFoundException e) {
            System.out.println("Erro CF: " + e.getMessage());
        } catch (EOFException e) {
            try { ois.close(); } catch (IOException e1) { }
        } catch (IOException e) {
            System.out.println("Erro G: " + e.getMessage());
        }
        return lst;
    }

}
