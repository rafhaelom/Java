// Importando Bibliotecas.
import java.awt.*;
import javax.swing.*;

// Criando Classe com extensão para um Container.
public class Dado extends JFrame {
    private JButton bt;
    int valor = (int)(Math.random() * 6) + 1;
    // Metodo Construtor.
    public Dado() {
        super("Dado");
        this.setSize(400,400);
        
        this.setVisible(true);
    }
    
    // Metodo para Desenhar.
    public void paint(Graphics g) {
        super.paint(g);
        bt = new JButton("O número sorteado foi " + valor);
        this.add(bt, BorderLayout.NORTH);
        // Desenhando Quadrilatero.
        // g.fillRect(x,y, larg, alt); -- Quadrilatero
        g.fillRect(100,100, 200,200);
        
        // Definindo a cor para o proximo desenho.
        // Definindo a cor    R   G   B   (0 a 255)
        g.setColor(new Color(255,255,255)); //Cor (White)
        
        //System.out.println(+valor);
        switch (valor) {
            case 1:         
                // Desenhando Circunferencia.
                // g.fillOval(x,y, larg, alt); -- Circunferencia
                g.fillOval(185,185, 30,30);
                break;
            case 2: 
                // Desenhando Circunferencia.
                // g.fillOval(x,y, larg, alt); -- Circunferencia
                g.fillOval(120,120, 30,30);
                g.fillOval(250,250, 30,30);
                break;
            case 3: 
                // Desenhando Circunferencia.
                // g.fillOval(x,y, larg, alt); -- Circunferencia
                g.fillOval(120,120, 30,30);
                g.fillOval(185,185, 30,30);
                g.fillOval(250,250, 30,30);
                break;
            case 4: 
                // Desenhando Circunferencia.
                // g.fillOval(x,y, larg, alt); -- Circunferencia
                g.fillOval(120,120, 30,30);
                g.fillOval(120,250, 30,30);
                g.fillOval(250,120, 30,30);
                g.fillOval(250,250, 30,30);
                break;
            case 5: 
                // Desenhando Circunferencia.
                // g.fillOval(x,y, larg, alt); -- Circunferencia
                g.fillOval(120,120, 30,30);
                g.fillOval(120,250, 30,30);
                g.fillOval(185,185, 30,30);
                g.fillOval(250,120, 30,30);
                g.fillOval(250,250, 30,30);
                break;
            case 6: 
                // Desenhando Circunferencia.
                // g.fillOval(x,y, larg, alt); -- Circunferencia
                g.fillOval(120,120, 30,30);
                g.fillOval(120,250, 30,30);
                g.fillOval(120,185, 30,30);
                g.fillOval(250,120, 30,30);
                g.fillOval(250,185, 30,30);
                g.fillOval(250,250, 30,30);
                break;
            default: 
                System.out.println("ERRO, Sortear Denovo!");
        }
    }
    
    // Metodo Principal.
    public static void main(String [] args) {
        new Dado();
    }
}