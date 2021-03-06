/* Crie uma classe java NumeroDecrescente que contenha um método 
 * que receba um número  inteiro e  imprima, em ordem decrescente,
 * o valor do número até 0.                 */

// Importando a classe Scanner para ser possivel obter(capturar) o resultado do usuario.
import java.util.Scanner;

public class Exercicio04 {
    // Objeto para obter(capturar) informação do usuário.
    // Objeto de informação.
    private Scanner sc = new Scanner(System.in);        // System.in -> Captura informação do usuário.
    
    public void executar(){
        // Informação ao usuario.
        // Solicita do usuario um numero inteiro.
        System.out.println("Digite um numero inteiro!!!");      // System.out -> Saida da informação.
        // Obtendo numa variável do tipo int a informação do usuario.
        int num = sc.nextInt();     // nextInt() -> verifica o proximo token obtido pelo Scanner() como um inteiro (int).
        System.out.println("\nValor informado: " + num);  // System.out -> Saida da informação.
        // Comando de repetição for para impressão do valor digitado pelo usuário até o zero.
        for (int i = 0; i <= num; num--){
            System.out.println(num);       // System.out -> Saida da informação.
        }
    }
    
    // Metodo main.
    public static void main(String [] args){
        Exercicio04 ex04 = new Exercicio04();
        ex04.executar();
    }
}
