/* Exercício 2. Comandos de Repetição
a) Criar uma classe chamada Quadrilatero.
b) Criar um método chamado executar(). Solicitar um valor inteiro através de 
um objeto da classe java.util.Scanner. Com base neste valor desenhar um 
quadrilátero com asteriscos. 
c) Chamar o método executar() através do método principal (main) da seguinte 
forma:
public static void main(String [] args) {
  Quadrilatero quad = new Quadrilatero();
  quad.executar();
}
Dica: Por exemplo, se o valor informado for 2, a saída será:
**
**
Se o valor informado for 3, a saída será:
***
***
***
E assim sucessivamente.               
*/

// Importando a classe Scanner para ser possivel obter(capturar) o resultado do usuario.
import java.util.Scanner;

public class Quadrilatero{
    // Objeto para obter(capturar) informação do usuário.
    // Objeto de informação.
    private Scanner sc = new Scanner(System.in);    // System.in -> Captura informação do usuário.
    private byte valor;   // Objeto valor do tipo byte. byte é um inteiro com saída decimal que pode ser de -128 a 127.
    public void executar(){
        // Informação ao usuario.
        // Solicita do usuario um numero inteiro.
        System.out.println("Digite um numero inteiro!!!");  // System.out -> Saida da informação.
        valor = sc.nextByte(); // nextByte() -> verifica o proximo token obtido pelo Scanner() como um byte.
        
        // Um for para gerar uma matriz(array) de asteriscos conforme a quantidade digitada pelo usuário.
        for (byte linha = 0; linha < valor; linha += 1) {   // Gera a linha.
            for (byte coluna = 0; coluna < valor; coluna += 1) {    // Gera a coluna.
                System.out.print('*');  // System.out -> Saida da informação.
            }
            System.out.println();   // System.out -> Saida da informação.
        }      
    }
    
    // Metodo principal (main).
    public static void main(String [] args) {
        Quadrilatero quad = new Quadrilatero();
        quad.executar();
    }
}