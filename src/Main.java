import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Conta;
        int Agencia;
        String Nome_do_cliente;
        double Saldo = 1024;


        Scanner ler = new Scanner(System.in);

        System.out.println("Olá, Digite o numero da Agencia: ");
        Agencia = ler.nextInt();
        System.out.println("Digite o número da Conta: ");
        Conta = ler.nextInt();
        System.out.println("Digite o Nome do cliente: ");
        Nome_do_cliente = ler.next();
        System.out.println("Ola " + Nome_do_cliente + " Obrigado por criar uma conta conosco, sua Agencia é: " + Agencia + " Conta: " + Conta + " e o seu Saldo " + Saldo + " ja esta disponivel para saque.");

    }
}