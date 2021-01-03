import javax.swing.*;
import java.awt.*;

//Janela Básica e sua estrutura.

public class Janela01 extends JFrame{
    
    public Janela01(){
        super("Janela01 - Básica"); //Titulo Janela.
        this.setSize(300, 300); //Tamanho da Janela.
        this.setVisible(true);  //Exibe a Janela.
    }
    
    public static void main(String [] args){
        new Janela01().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}