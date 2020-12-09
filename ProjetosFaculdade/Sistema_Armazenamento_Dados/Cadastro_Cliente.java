import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.*; // Caminho de Pesquisa
import java.awt.*;
import java.awt.event.*;

// Layout padrao eh o BorderLayout
public class Cadastro_Cliente extends JDialog {
   
    private JTextField dataAtual = new JTextField("",20);
    private JTextField nome = new JTextField("",20);
    private JTextField email = new JTextField("",15);
    private JTextField telefone = new JTextField("",13);
   
    private ManipulaDados md = new ManipulaDados();
    
    private List<Dados_Email> lstDE = new ArrayList<>();
    
    public Cadastro_Cliente() {
        //super("Cadastro de Cliente");
        this.setSize(450,350);
        this.setModal(true);
        
        montarTelaCentral();
        
        JPanel pnBotoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btSalvar = new JButton("Salvar");
        btSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aoGravar();
            }
        });
        pnBotoes.add(btSalvar);
        
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                aoFechar();
            }
        }); 
        
        this.add(pnBotoes, BorderLayout.SOUTH);
        lstDE = md.lerDados();
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void montarTelaCentral() {
        // Criar um painel - FlowLayout
        JPanel pn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pn1.add(new JLabel("Data:"));
        pn1.add(dataAtual);
        pn1.add(new JLabel("Exemplo: DD/MM/AAAA."));
        
        JPanel pn2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pn2.add(new JLabel("Nome:"));
        pn2.add(nome);
        pn2.add(new JLabel("Exemplo: Nome e Sobrenome."));
        
        JPanel pn3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pn3.add(new JLabel("Email:"));
        pn3.add(email);
        pn3.add(new JLabel("Exemplo: aaaaaa@bbbb.com"));
        
        JPanel pn4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pn4.add(new JLabel("Telefone:"));
        pn4.add(telefone);
        pn4.add(new JLabel("Exemplo: 00-112345678"));

        JPanel pn = new JPanel();
        pn.setLayout(new GridLayout(4,1,5,5));
        pn.add(pn1); // 1ª Linha
        pn.add(pn2); // 2ª Linha
        pn.add(pn3); // 3ª Linha
        pn.add(pn4); // 4ª Linha

        this.add(pn);
    }
    
    private void aoGravar() {
        System.out.println("Gravando os dados");
        // Campo 1
        Date dataAt = stToDate(dataAtual.getText());
        // Campo 2
        String nom = nome.getText();
        // Campo 3
        String ema = email.getText();
        // Campo 4
        String tel = telefone.getText();
        
        Dados_Email de = adicionarParaObjeto(dataAt, nom, ema, tel);
        lstDE.add(de);
    }
    
    public void aoListar() {
        for (Dados_Email de: lstDE) {
            System.out.println("No dia " + de.getDataAtual() + " Cliente: " + de.getNome() + " Email: " + de.getEmail() + " Telefone: " + de.getTelefone());
        }
    }
    
    private Dados_Email adicionarParaObjeto(Date dataAt, String nom, String ema, String tel) {
        // Criar objeto
        Dados_Email de = new Dados_Email();
        de.setDataAtual(dataAt);
        de.setNome(nom);
        de.setEmail(ema);
        de.setTelefone(tel);
        return de;
    }
    
    private Date stToDate(String val) {
        Date data = new Date();
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            data = formatter.parse(val);        
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        return data;
    }
    
    private void aoFechar() {
        System.out.println("Fechando Janela");
        md.gravarDados(lstDE);
    }
    
    public static void main(String [] args) {
        new Cadastro_Cliente();
    }
}