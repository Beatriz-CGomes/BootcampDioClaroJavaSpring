package desafios.contaBanco.application;

import desafios.contaBanco.model.ContaTerminal;

import java.util.Scanner;

public class ContaTerminalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, entre com as informações para criar uma conta ");

        System.out.print("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o número da sua agência: ");
        String agencia = sc.nextLine();

        System.out.print("Digite o número da sua conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o valor do seu saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        ContaTerminal conta = new ContaTerminal(numero, nomeCliente, agencia, saldo);

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigada por criar uma conta em nosso banco, sua agência é: "
                + conta.getAgencia() + " e seu saldo R$" + conta.getSaldo() + " já está disponível para saque");


        sc.close();
    }
}
