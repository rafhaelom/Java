import javax.swing.*;
import java.awt.*;

//Janela Básica e sua estrutura.
//JLabel -> Um JLabelobjeto pode exibir um texto, uma imagem ou ambos.

public class Janela02_1 extends JFrame{
    
    private JLabel lb_im;
    
    public Janela02_1(){
        super("Janela02_1 - JLabel Imagem"); //Titulo Janela.
        this.setSize(300, 300); //Tamanho da Janela.
        
        ImageIcon imagem = new ImageIcon("Penguins.jpg");   //Definindo objeto e caminho da imagem.
                                          //Dimensões:   altura, largura, sinalizador para reamostragem da imagem.                                  
        imagem.setImage(imagem.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));  //Definindo tamanho da imagem.
        lb_im = new JLabel(imagem);
        
        this.add(lb_im);
        this.setVisible(true);  //Exibe a Janela.
    }
    
    public static void main(String [] args){
        new Janela02_1().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
