import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Exercicio1 {  
    
    private static ArrayList<String> separaString(String string, int tamanhoSeparacao) {
        ArrayList<String> listaTeste = new ArrayList<String>();
        for (int i = 0; i < string.length()-tamanhoSeparacao; i++) {
            String acumulador = "";
            for (int j = i; j < tamanhoSeparacao; j++) {
                acumulador = acumulador + string.charAt(j);
            }
            listaTeste.add(acumulador);
        }
        return listaTeste;
    }

    public static void main(String args[]) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String string = keyboard.next();
        // ArrayList<String> lista = separaString(string,2);
        // System.out.println(lista.toString());
    }
}
