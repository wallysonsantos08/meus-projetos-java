import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean podeSair = true;
        System.out.println("Coloque sua digital: ");
        IdDoUsuario idEncontrado = new IdDoUsuario();
        System.out.println("Boas vindas");
        Scanner scan = new Scanner(System.in);

        while (podeSair) {
            
            System.out.print("Digite 1 para ver SALDO, 2 para DEPOSITAR,3 para fazer um SAQUE ou 4 para SAIR: ");

            try {
                int escolha = scan.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Seu saldo é de: R$" + idEncontrado.getSaldo());
                        break;
                    case 2:
                        System.out.println("Digite quanto deseja depositar: ");
                        double valorDeposito = scan.nextDouble();
                        idEncontrado.adicionarValor(valorDeposito);
                        break;
                    case 3:
                        System.out.println("Digite quanto deseja sacar: ");
                        double valorSaque = scan.nextDouble();
                        idEncontrado.sacarValor(valorSaque);
                        break;
                    case 4:
                        podeSair = false;
                        break;
                    default:
                        System.out.println("Você não digitou um numero valido!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Você não digitou um algoritimo valido! ");
            }   // TODO: handle exception
            }

            System.out.println("Obrigado pela preferencia, volte sempre!!");
            scan.close();           
        }
    }
