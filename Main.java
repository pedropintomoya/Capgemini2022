import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Por favor, coloque o numero da questao que deseja checar: ");
            int questao = scan.nextInt();
            switch(questao){
                case 1:
                    PrimeiroDesafio.resposta();
                    break;
                case 2:
                    SegundoDesafio.resposta();
                    break;
                case 3:
                    TerceiroDesafio.resposta();
                    break;
                default:
                    System.out.println("Numero Invalido");
            }
        }

	}
}