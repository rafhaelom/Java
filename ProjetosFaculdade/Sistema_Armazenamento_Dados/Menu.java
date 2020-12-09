import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
    private List<Dados_Email> lstDE = new ArrayList<>();
    private ManipulaDados md = new ManipulaDados();
    public Menu() {
        super("Cadastro de Cliente"); // Titulo barra.
        this.setSize(300, 300); // Tamanho Janela.
        
        // Menu de barras.
        JMenu aba1 = new JMenu("Cliente");
        JMenuItem aba1_item1 = new JMenuItem("Cadastrar");
        JMenuItem aba1_item2 = new JMenuItem("Alterar");
        JMenuItem aba1_item3 = new JMenuItem("Excluir");
        aba1_item1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                aoAcionar();
            }
        });
        
        JMenu aba2 = new JMenu("Listar");
        JMenuItem aba2_item1 = new JMenuItem("Todos");
        JMenuItem aba2_item2 = new JMenuItem("Pesquisar");
        aba2_item1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                aoLer();
            }
        });
        
        JMenu aba3 = new JMenu("Sair");
        aba3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                aoSair();
            }
        });
        
        JMenuBar jmb = new JMenuBar();
        
        // Adicionando na janela.
        aba1.add(aba1_item1);
        aba1.add(aba1_item2);
        aba1.add(aba1_item3);
        aba2.add(aba2_item1);
        aba2.add(aba2_item2);
        
        jmb.add(aba1);
        jmb.add(aba2);
        jmb.add(aba3);
        
        this.setJMenuBar(jmb); // Exibe menu barras.
        lstDE = md.lerDados();
        this.setVisible(true); // Exibe a janela.
    }
    
    public void paint(Graphics g) { // Retangulo na janela.
    super.paint(g);

    // Especificando cor.
    g.setColor(new Color(106,90,205)); // Cor: SlateBlue.
    // Colocar Texto na imagem
    g.drawString("Marketing Digital", 120, 120);
    }
    
    private void aoAcionar() {
        System.out.println("Acionar Item");
        new Cadastro_Cliente();
    }
    
    private void aoLer() {
        System.out.println("Listar Todos");
        ManipulaDados le = new ManipulaDados();
        lstDE = le.lerDados();
        for (Dados_Email de: lstDE) {
            System.out.println("No dia " + de.getDataAtual() + " Cliente: " + de.getNome() + " Email: " + de.getEmail() + " Telefone: " + de.getTelefone());
        }
    }
    
    private void aoSair() {
        System.out.println("Fechando Janela");
    }
    
    public static void main(String [] args) {
        new Menu().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}