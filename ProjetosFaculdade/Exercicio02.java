/* Obter uma entrada pelo teclado contendo 2 números e como resultado mostrar:
 * Os números [primeiro número] e [segundo número]:
 * Somados são [valor da soma]
 * Subtraídos são [valor da subtração]
 * Multiplicados são [valor da multiplicação]
 * Divididos são [valor da divisão]                               */

// Importando a classe Scanner para ser possivel obter(capturar) o resultado do usuario.
import java.util.Scanner;

public class Exercicio02 {
    // Objeto para obter(capturar) informação do usuário.
    // Objeto de informação.
    private Scanner sc = new Scanner(System.in);        // System.in -> Captura informação do usuário.
    
    public void obterNumero(){
        // Variavel com valor zero, para ser possível verificar a divisão.
        float a = 0;
        
        // Informação ao usuario.
        System.out.println("Informe dois numeros!!!\n");      // System.out -> Saida da informação.
        
        // Solicitando o primeiro numero.
        System.out.println("Primeiro numero: ");    // System.out -> Saida da informação.
        float num1 = sc.nextInt();    // Obtendo numa variável do tipo int a informação do usuario.
        // Solicitando o segundo numero.
        System.out.println("Segundo numero: ");     // System.out -> Saida da informação.
        float num2 = sc.nextInt();    // Obtendo numa variável do tipo int a informação do usuario.
        
        System.out.println("\nOs números [" + num1 + "] e [" + num2 + "]:");    // Mostra numeros digitados.
        System.out.println("Somados são [" + (num1 + num2) + "]");      // Soma.
        System.out.println("Subtraídos são [" + (num1 - num2) + "]");       // Subtração.
        System.out.println("Multiplicados são [" + (num1 * num2) + "]");    // Multiplicação.
        // Condição para verificar se eh possível a divisão.
        if(num2 == a){
            System.out.println("Não eh possivel a divisao!!!");
        }else{
            System.out.println("Divididos são        [" + (num1 / num2) + "]");     // Divisão.
        }
    }
    
    // Metodo main.
    public static void main(String [] args){
        Exercicio02 ex02 = new Exercicio02();
        ex02.obterNumero();
    }
}
