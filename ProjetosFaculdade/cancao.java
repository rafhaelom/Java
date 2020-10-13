// Classe Principal.
public class cancao {
    // Realiza a impressao do titulo da musica.
    public void emitirParteSuperior(){
        // Titulo da musica.
        System.out.println(" The Twelve Days Of Christmas \n");
    }
    
    // Realiza a impressao da parte inferior da musica, sendo essa o corpo da musica, ou seja, as estrofes.
    public void emitirParteInferior(){
        // Variavel dia em String para ser possivel imprimir o dia por extenso.
        String dia = "";
        
        // for ou contador podemos dizer para definicao do dia na frase.
        for(byte estrofe = 1; estrofe <= 12; estrofe++){
            // switch para definicao do dia.
            switch(estrofe){
                case 1:
                    dia = "first";
                    break;
                case 2:
                    dia = "second";
                    break;
                case 3:
                    dia = "third";
                    break;
                case 4:
                    dia = "fourth";
                    break;
                case 5:
                    dia = "fifth";
                    break;
                case 6:
                    dia = "sixth";
                    break;
                case 7:
                    dia = "seventh";
                    break;
                case 8:
                    dia = "eighth";
                    break;
                case 9:
                    dia = "ninth";
                    break;
                case 10:
                    dia = "tenth";
                    break;
                case 11:
                    dia = "eleventh";
                    break;
                case 12:
                    dia = "twelfth";
                    break;
                default:
                    break;
            }
            
            /* Realiza a impressao da frase + (mais) o conteudo da variavel com o switch, que é determinado
             * atravez do valor fornecido pelo for, + (mais) segunda frase e por fim outra frase inicial.
            */
            System.out.println("On the " + dia + " day of Christmas,");
            System.out.println("my true love sent to me:");
            
            // Switch para impressao das estrofes.
            switch (estrofe) {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:    
                    System.out.println("Eleven pipers piping,");
                case 10:    
                    System.out.println("Ten lords a-leaping,");
                case 9:        
                    System.out.println("Nine ladies dancing,");
                case 8:        
                    System.out.println("Eight maids a-milking,");
                case 7:        
                    System.out.println("Seven swans a-swimming,");
                case 6:        
                    System.out.println("Six geese a-laying,");
                case 5:        
                    System.out.println("Five golden rings,");
                case 4:        
                    System.out.println("Four calling birds,");
                case 3:        
                    System.out.println("Three French hens,");
                case 2:        
                    System.out.println("Two turtle doves,"); 
                default:
                    // Condicao para impressao da ultima frase.
                    if (estrofe == 1) {
                        System.out.println("A partridge in a pear tree. \n");
                    }
                    else {
                        System.out.println("And a partridge in a pear tree. \n");
                    }
            }
        }
    }
    
    // Junta/Estrutura o que precisa ser feito na ordem.
    public void estruturar(){
        emitirParteSuperior();
        emitirParteInferior();
    }
    
    //Método Principal para execução do programa.
    public static void main (String [] args){
        cancao Cancao = new cancao();
        Cancao.estruturar();
    }
}