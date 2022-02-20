import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Exercicio2 {  

    /** Função para verificar se a string passada possui um caracter especial (!@#$%^&*()-+)       
    * @param string String - String a ser verificada.
    * @return Boolean - Retorna True caso tenha encontrado um caracter especial, ou false caso não tenha encontrado
    */

    private static Boolean possuiCaracterEspecial (String string){
        Pattern pattern = Pattern.compile(".*[!@#$%^&*()-+]");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    /** Função para verificar se a string passada possui um caracter maiusculo
    * @param string String - String a ser verificada.
    * @return Boolean - Retorna True caso tenha encontrado um caracter maiusculo ou false caso não tenha encontrado
    */

    private static Boolean possuiCaracterMaiusculo (String string){
        Pattern pattern = Pattern.compile(".*[A-Z]");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    /** Função para verificar se a string passada possui um caracter minusculo
    * @param string String - String a ser verificada.
    * @return Boolean - Retorna True caso tenha encontrado um caracter minusculo ou false caso não tenha encontrado
    */

    private static Boolean possuiCaracterMinusculo (String string){
        Pattern pattern = Pattern.compile(".*[a-z]");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    /** Função para verificar se a string passada possui um digito
    * @param string String - String a ser verificada.
    * @return Boolean - Retorna True caso tenha encontrado um digito ou false caso não tenha encontrado
    */

    private static Boolean possuiDigito (String string){
        Pattern pattern = Pattern.compile(".*[0-9]");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    /** Função para verificar se a string passada a quantidade minima de dígitos
    * @param string String - String a ser verificada.
    * @return Boolean - Retorna True caso tenha mais que 5 caracteres um digito ou false caso não tenha 
    */

    private static Boolean possuiQuantidadeMinima (String string){
        return string.length() >= 6;
    }

    /** Função para verificar a senha possui os requisitos para ser forte
    * @param senha String - Senha a ser verificada.
    * @return Boolean - Retorna a quantidade de caracteres que deve ser inserido na senha passada para que ela se torne forte
    */

    private static int VerificaSenha (String senha){
        int contador = 0;
        
        if(!possuiCaracterEspecial(senha)){
            contador++;
        }

        if(!possuiCaracterMaiusculo(senha)){
            contador++;
        }
        if(!possuiCaracterMinusculo(senha)){
            contador++;
        }

        if(!possuiDigito(senha)){
            contador++;
        }

        if(!possuiQuantidadeMinima(senha)){
            if(contador+senha.length() < 6){
                contador = (6 - senha.length());
            }
        }
        return contador;
    }


    public static void main(String args[]) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String senha = keyboard.next();
        System.out.println(VerificaSenha(senha));
    }
}
