/* Desenvolva um algoritmo em Java que leia um número inteiro e 
 * imprima o seu antecessor e seu sucessor.                                */

// Importando a classe Scanner para ser possivel obter(capturar) o resultado do usuario.
import java.util.Scanner;

public class Exercicio05 {
    // Objeto para obter(capturar) informação do usuário.
    // Objeto de informação.
    private Scanner sc = new Scanner(System.in);        // System.in -> Captura informação do usuário.
    
    public void executar(){
        // Informação ao usuario.
        // Solicita do usuario um numero inteiro.
        System.out.println("Digite um numero inteiro!!!");      // System.out -> Saida da informação.
        // Obtendo numa variável do tipo int a informação do usuario.
        int num = sc.nextInt();     // nextInt() -> verifica o proximo token obtido pelo Scanner() como um inteiro (int).
        
        System.out.println("\nAntecessor: " + (num - 1));  // System.out -> Saida da informação.
        System.out.println("Informado: " + num);  // System.out -> Saida da informação.
        System.out.println("Sucessor: " + (num + 1));  // System.out -> Saida da informação.
    }
    
    // Metodo main.
    public static void main(String [] args){
        Exercicio05 ex05 = new Exercicio05();
        ex05.executar();
    }
}
