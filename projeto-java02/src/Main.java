import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declarar variaveis

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int quantosDadosEstaRolando;
        int total = 0;

        //numero de dados do usuario

        System.out.print("Insira o numero de dados para ser rolados: ");
        quantosDadosEstaRolando = scan.nextInt();

        //verificar de o numero de dados é > que 0

        if (quantosDadosEstaRolando > 0) {
            System.out.println("Você jogou os dados");
            for (int i = 0; i <= quantosDadosEstaRolando; i++) {
                int aleatorio = random.nextInt(1,7);
                System.out.println("Dado no valor: "+ aleatorio);
                total = total + aleatorio;
            }
            System.out.println("Vator total dos seus dados é de: "+ total);
        }
        else{
            System.out.println("Você tem que rolar pelo menos um dado!!");
        }
    
        scan.close();
    }
}