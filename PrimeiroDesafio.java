import java.util.Scanner;
public class PrimeiroDesafio{
    public static void resposta(){
        /*declaro o scan para poder ter input do teclado*/
        Scanner scan = new Scanner(System.in);
        while(true){
            /*pego input do teclado*/
            System.out.print("Por favor, digite um valor valido para N.\nN = ");
            int n = scan.nextInt();
            if(n>0){
                escada(n);
                break;
            }
        }
    }


    public static void escada(int n){
        /*rodo o processo de criar uma linha N vezes*/
        for (int i = 1; i <= n; ++i){
            /*preencho os espacos necessarios de acordo com a linha que estou*/
            for(int j = 1; j <= n - i; ++j){
                System.out.print(" ");
            }
            /*faco o mesmo para o restante da linha, preenchendo ela com '*'*/
            for(int x = n - i + 1; x <= n; ++x){
                System.out.print("*");
            }
            /*pulo para a proxima linha apos preencher ela corretamente*/
            System.out.println();
        }
    }

}