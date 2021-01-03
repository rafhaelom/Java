import javax.swing.*;
import java.awt.*;

//Janela Básica e sua estrutura.
//JLabel -> Um JLabelobjeto pode exibir um texto, uma imagem ou ambos.

public class Janela02 extends JFrame{
    
    private JLabel lb;
    
    public Janela02(){
        super("Janela02 - Texto"); //Titulo Janela.
        this.setSize(300, 300); //Tamanho da Janela.
        
        lb = new JLabel("Este é o JLabel");
        
        this.add(lb);
        this.setVisible(true);  //Exibe a Janela.
    }
    
    public static void main(String [] args){
        new Janela02().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
