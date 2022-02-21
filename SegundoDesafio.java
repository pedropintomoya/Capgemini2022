/* */

import java.util.Scanner;
public class SegundoDesafio{
	public static void resposta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque sua senha: ");

        String senha = scan.nextLine();
        
        int resposta = checaSenha(senha);
        System.out.println(resposta);
	}
    public static int checaSenha(String senha){
        /*Realizo todos os testes para averiguar se a senha esta de acordo com os parametros exigidos*/
        int tamanho = checaTamanho(senha);
        int minusculo = checaMinusculo(senha);
        int maiusculo = checaMaiusculo(senha);
        int digito = checaDigito(senha);
        int especial = checaEspecial(senha);
        
        /*Realizo a soma dos parametros*/
        int aux = minusculo + maiusculo + digito + especial;
        /*aux2 nesta funcao sera quantos caracteres faltam para satisfazer os criterios para uma senha segura*/
        int aux2 = 0;
        /*retorna a soma se este for maior que o numero de caracteres que falta para ser maior que 6, caso contrario retorna o tamanho*/
        if(aux >= tamanho){
            aux2 = aux;
        }else if (tamanho > aux){
            aux2 = tamanho;
        }
        return aux2;
    }
    /*Checa se o tamanho da string esta correto*/
    public static int checaTamanho(String senha){
        int aux = senha.length();
        int faltaDigitos = 6 - aux;
        if(faltaDigitos > 0){
            return faltaDigitos;
        }
        else{
            return 0;
        }
    }
    /*Checa se a string tem letra minuscula */
    public static int checaMinusculo(String senha){
        int temMinusculo = 1;
        for(int i = 0; i < senha.length(); i++){
            if(Character.isLowerCase(senha.charAt(i))){
                temMinusculo = 0;
            }
        }
        return temMinusculo;
    }
    /*Checa se a string tem letra maiuscula */
    public static int checaMaiusculo(String senha){
        int temMaiusculo = 1;
        for(int i = 0; i < senha.length(); i++){
            if(Character.isUpperCase(senha.charAt(i))){
                temMaiusculo = 0;
            }
        }
        return temMaiusculo;
    }
    /*Checa se a string tem numero*/
    public static int checaDigito(String senha){
        int temDigito = 1;
        for(int i = 0; i < senha.length(); i++){
            if(Character.isDigit(senha.charAt(i))){
                temDigito = 0;
            }
        }
        return temDigito;
    }
    /*Checa se a string tem letra caractere especial*/
    public static int checaEspecial(String senha){
        int temEspecial = 1;
        for(int i = 0; i < senha.length(); i++){
            switch(senha.charAt(i)){
                case '!':
                    temEspecial = 0;
                    break;
                case '@':
                    temEspecial = 0;
                    break;
                case '#':
                    temEspecial = 0;
                    break;
                case '$':
                    temEspecial = 0;
                    break;
                case '%':
                    temEspecial = 0;
                    break;
                case '^':
                    temEspecial = 0;
                    break;
                case '+':
                    temEspecial = 0;
                    break;
                case '*':
                    temEspecial = 0;
                    break;
                case '(':
                    temEspecial = 0;
                    break;
                case ')':
                    temEspecial = 0;
                    break;
                case '-':
                    temEspecial = 0;
                    break;                             
            }
        }
        return temEspecial;
    }
}