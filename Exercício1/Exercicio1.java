import java.util.Scanner;
class Exercicio1 {  

    /** Função para formatar a string de entrada e colocar espaços vazios a esquerda       
    * @param string String - String a ser formatada.
    * @param numeroEspaco int - Numero de espaços a esquerda a serem colocados.
    * @return String - String com espaços a esquerda
    */

    private static String EspacoEsquerdo(String string, int numeroEspaco) {
        return String.format("%" + numeroEspaco + "s", string);  
    }

    /** Função para repetir a string de entrada um determinado número de vezes  
    * @param string String - String a ser repetida.
    * @param numeroRepeticoes int - Numero de vezes que a string será repetida.
    * @return String - String com repetições da String de entrada
    */

    private static String RepeteString(String string, int numeroRepeticoes){
        return String.format("%0" + numeroRepeticoes + "d", 0).replace("0", string);
    }

    public static void main(String args[]) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for (int i = 0; i < n; i++) {
            String repeticoes = RepeteString("*",i+1);
            System.out.println(EspacoEsquerdo(repeticoes, n));      
        }
    }
}
