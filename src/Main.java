import java.util.Locale;
import java.util.Scanner;
import entities.Conta;



public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Conta conta;

    System.out.println("Informe o número da conta: ");
    int nconta = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Informe o titular da conta: ");
    String nome = scanner.nextLine();

    System.out.println("Voce vai fazer um depósito inicial? (S/N)");
    char inicial = scanner.next().charAt(0);
    if(inicial == 's') {
        System.out.println("Quanto será o valor do deposito inicial? ");
        double valor = scanner.nextDouble();
        conta = new Conta(nconta, nome, valor);
    }else {
        conta  = new Conta(nconta,nome);
    }
    System.out.println();
    conta.dados();
    System.out.println();

    System.out.println("Qual o valor que você quer depositar? ");
        double d = scanner.nextDouble();

    conta.deposito(d);
    conta.dados();

    System.out.println("Qual o valor que você deseja sacar? ");
    double s = scanner.nextDouble();

    conta.retirar(s);
    System.out.println("Dados da conta atualizado");
    conta.dados();

    scanner.close();


    }
}
