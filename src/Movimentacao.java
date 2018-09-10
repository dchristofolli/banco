import java.util.Scanner;
import java.util.Random;

public class Movimentacao {
    static Random gerador = new Random();
    static int index = 0;
    static int tamanho = index + 1;
    static Conta[] conta = new Conta[tamanho];

    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        System.out.println(">>>>> BANCO <<<<< \nEscolha uma das opções: \n1 - Abertura de conta \n2 - Consulta de Saldos" +
                "\n3 - Saque \n4 - Depósito \n0 - Sair");
        int escolha = Integer.parseInt(teclado("Digite uma das opções:"));
        if (escolha == 1)
            abreConta();
        if (escolha == 2)
            saldo();
        if (escolha == 3)
            saque();
        if (escolha == 4)
            deposito();
        else
            System.exit(0);
    }

    private static void abreConta() {
        boolean cliente_especial = false;
        System.out.println(">>>>> Abertura de conta <<<<<");
        String num_conta = String.valueOf((gerador.nextInt(1000)+1000));
        System.out.println("Número da conta: "+num_conta);
        String nome = teclado("Digite o nome do cliente");
        double saldo = Double.parseDouble(teclado("Digite o valor do depósito inicial"));
        String status = teclado("Cliente especial? (S/N)").toLowerCase();
        if (status == "s")
            cliente_especial = true;
        else
            cliente_especial = false;
        conta[index] = new Conta(num_conta, nome, saldo, cliente_especial);
        conta[index].toString();
        index++;
        menu();
    }

    private static void saldo() {
        System.out.println(">>>>> Consulta de saldos <<<<<");
    }

    private static void saque() {
        System.out.println(">>>>> Saque <<<<<");
    }

    private static void deposito() {
        System.out.println(">>>>> Depósito <<<<<");
    }

    private static String teclado(String texto) {
        System.out.println(texto);
        String e = new Scanner(System.in).nextLine();
        return e;
    }
}
