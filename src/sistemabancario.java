import java.util.Scanner;

import static java.lang.String.format;

public class sistemabancario {
    public static void main(String[] args) {
        int opcao = 0;
        double receber =0;
        double transfer=0 ;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        System.out.println(" Digite 1-Conta Corrente\n Digite 2-Conta Poupança");
        int tipoConta = ler.nextInt();
        System.out.println("Informe o saldo iniciar ");
        double saldo = ler.nextDouble();

        System.out.println("\n\n\n\n\n********************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println(format("Nome:  %s",nome));
        if (tipoConta == 1){
            System.out.println("Conta: Corrente");
        }
        else {
            System.out.println("Conta: Poupança");
        }
        System.out.println(format("Saldo: R$%.2f ",saldo));
        System.out.println("********************************************************\n");

        while (opcao != 4){
            System.out.println("<-----Escolha uma opção----->");
            System.out.println("1- Consultar saldo \n2- Receber Valor \n3- Transferir valor \n4- Sair");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(format("Seu saldo R$%.2f",saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    receber = ler.nextDouble();
                    saldo += receber;
                    System.out.println(format("Seu saldo R$%.2f",saldo));
                    break;
                case 3:
                    System.out.println("Informe o valor a ser transferido: ");
                    transfer = ler.nextDouble();
                    if (transfer <= saldo){
                        saldo -= transfer;
                        System.out.println(format("Seu saldo R$%.2f",saldo));
                    }else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema!");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;

            }

        }


    }

}
