/* Crie uma classe java MaiorNumero que contenha um método que 
 * receba dois números inteiros e imprima o maior entre eles.                */

// Importando a classe Scanner para ser possivel obter(capturar) o resultado do usuario.
import java.util.Scanner;

public class Exercicio01 {
    // Objeto para obter(capturar) informação do usuário.
    // Objeto de informação.
    private Scanner sc = new Scanner(System.in);        // System.in -> Captura informação do usuário.
    
    public void MaiorNumero(){
        // Informação ao usuario.
        System.out.println("Informe dois numeros inteiros!!!\n");      // System.out -> Saida da informação.
        
        // Solicitando o primeiro numero.
        System.out.println("Primeiro numero: ");    // System.out -> Saida da informação.
        int num1 = sc.nextInt();    // Obtendo numa variável do tipo int a informação do usuario.
        // Solicitando o segundo numero.
        System.out.println("Segundo numero: ");     // System.out -> Saida da informação.
        int num2 = sc.nextInt();    // Obtendo numa variável do tipo int a informação do usuario.
        
        // Condição para estabelecer quem eh o maior numero digitado pelo usuario.
        if(num1 > num2){
            System.out.println("O Maior numero eh: " +num1);    // System.out -> Saida da informação.
        } else if(num2 > num1){
            System.out.println("O Maior numero eh: " +num2);    // System.out -> Saida da informação.
        } else{
            System.out.println("Os dois numeros sao iguais!");    // System.out -> Saida da informação.
        }
    }
    
    // Metodo main.
    public static void main(String [] args){
        Exercicio01 ex01 = new Exercicio01();
        ex01.MaiorNumero();
    }
}