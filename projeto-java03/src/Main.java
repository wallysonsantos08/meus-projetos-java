import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaraçao de variaveis

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Escolha 1 = pedra, 2 tesoura ou 3 papel");
        boolean sairDoLupim = false;

        while (sairDoLupim) {
            System.out.println("Pedra, papel, tesoura...");
            int entrada = scan.nextInt();
            int aleatorio = random.nextInt(1,4);
            switch (entrada) {
                case 1:
                    
                    System.out.println("V");

                    
                    break;
            
                default:
                    break;
            }
            
            

            
        }

        






    }
}
