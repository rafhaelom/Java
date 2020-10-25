/* Faça um programa em Java que peça ao usuário para digitar um texto 
 * e informe quantos caracteres possui o texto informado pelo usuário. 
 * (Utilize o método length()). */

// Importando a classe Scanner para ser possivel obter(capturar) o resultado do usuario.
// Importando a classe String para utilizar o método length() que retorna o tamanho da String.
import java.util.Scanner;
import java.lang.String;

public class Exercicio03 {
    // Objeto para obter(capturar) informação do usuário.
    // Objeto de informação.
    private Scanner sc = new Scanner(System.in);        // System.in -> Captura informação do usuário.
    
    public void obterDig(){
        // Informação ao usuario.
        System.out.println("Digite uma letra ou uma palavra!!!");      // System.out -> Saida da informação.
        // Solicita do usuario a letra ou palavra.
        // Obtendo numa variável do tipo String a informação do usuario.
        String dig = sc.next();     // next() -> retorna o proximo token obtido pelo Scanner().
        System.out.println("\nDigtado eh: " + dig);  // System.out -> Saida da informação.
        // System.out -> Saida da informação.
        System.out.println("Tamanho do que foi digtado eh: " + dig.length());  // length() -> retorna o tamanho da string.
    }
    
    // Metodo main.
    public static void main(String [] args){
        Exercicio03 ex03 = new Exercicio03();
        ex03.obterDig();
    }
}
