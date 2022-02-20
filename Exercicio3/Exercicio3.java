import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Exercicio3 {  

    /** Função para verificar se duas strings são anagramas.
    * @param primeiraString String - String que irá servir de base para a comparação.
    * @param segundaString String - String que será comparada para verificar se são anagramas.
    * @return Boolean - Retorna true caso as 2 strings de parâmetro sejam anagramas, ou false caso contrário.
    */
    private static boolean saoAnagramas(String primeiraString, String segundaString) {
        char[] primeiroArrayChar = primeiraString.toCharArray();
        char[] segundoArrayChar = segundaString.toCharArray();
        Arrays.sort(primeiroArrayChar);
        Arrays.sort(segundoArrayChar);
        return Arrays.equals(primeiroArrayChar, segundoArrayChar);
    }
    
    /** Função para separar uma string em uma lista de subStrings.
    * @param string String - String a ser subdividida.
    * @param tamanhoSeparacao int - tamanho das subStrings.
    * @return ArrayList<String> - Retorna uma lista de subStrings da String de parâmetro.
    */
    private static ArrayList<String> separaString(String string, int tamanhoSeparacao) {
        ArrayList<String> listaStringSeparada = new ArrayList<String>();
        for (int i = 0; i < string.length()-tamanhoSeparacao+1; i++) {
            String acumulador = "";
            for (int j = 0; j < tamanhoSeparacao; j++) {
                acumulador = acumulador + string.charAt(i+j);
            }
            listaStringSeparada.add(acumulador);
        }
        return listaStringSeparada;
    }

    
    /** Função para contar quantos anagramas existem uma lista de strings.
    * @param listaString ArrayList<String> - Lista de strings a ser analisada.
    * @return int - Retorna a quantidade de anagramas na lista passada como parâmetro.
    */
    private static int contaAnagramasEmLista(ArrayList<String> listaString) {
        int tamanhoLista = listaString.size();
        int contador = 0;
        System.out.println(listaString.toString()+"\n");
        for (int i = 0; i < tamanhoLista-1; i++) {
            String stringAtual = listaString.get(i);
            for (int j = i+1; j < tamanhoLista; j++) {
                String stringAComparar = listaString.get(j);
                System.out.println("stringAtual: " + stringAtual + " stringAComparar: " + stringAComparar + " \nresultado: " + saoAnagramas(stringAtual,stringAComparar) + " \n");
                if (saoAnagramas(stringAtual,stringAComparar)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    /** Função para contar quantos subAnagramas existem em uma String.
    * @param string String - String a ser analisada.
    * @return int - Retorna a quantidade de subAnagramas na String de parâmetro.
    */
    private static String contaSubAnagramas(String string) {
        int contador = 0;
        int limiteDivisao = string.length()/2;
        if(string.length()%2 != 0){
            limiteDivisao++;
        }
        for (int i = 1; i <= limiteDivisao; i++) {
            ArrayList<String> stringDividida = separaString(string, i);
            contador += contaAnagramasEmLista(stringDividida);
        }
        return contador+"";
    }

    public static void main(String args[]) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String string = keyboard.next();
        System.out.println(contaSubAnagramas(string));
    }
}
