package pacote.teste;

import java.util.Scanner;

public class Gestão_de_Conta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conta c1 = new Conta();
		
		int opcao = 0;
		
		System.out.println("Bem-vindo a sua conta bancaria");
		System.out.println("Informe seu nome: ");
        c1.titular = teclado.nextLine();
        System.out.println("Informe seu o número da sua conta: ");
        c1.numero = teclado.nextInt();
        System.out.println("Informe seu número da sua agencia: ");
        c1.agencia = teclado.next();
        System.out.println("Informe seu a data de abertura da conta(dd/mm/aaaa): ");
        c1.dataDeAbertura = teclado.next();
        
        while(opcao != 6){
        	System.out.println("--------------------------------");
            System.out.println("Selecione uma opção:");
            System.out.println("(1)Realizar um saque");
            System.out.println("(2)Realizar um depósito");
            System.out.println("(3)Visualizar o saldo");
            System.out.println("(4)Calcular o rendimento mensal");
            System.out.println("(5)Visualizar dados da conta");
            System.out.println("(6)Sair");
            opcao = teclado.nextInt();
        
            if(opcao == 1){
                System.out.print("Informe a quatia que deseja sacar: ");
                c1.sacar(teclado.nextDouble());
            }
            else if(opcao == 2){
                System.out.print("Informe a quantia que deseja depositar: ");
                c1.depositar(teclado.nextDouble());
            }
            else if(opcao == 3){
                System.out.println("Seu saldo é: R$" + c1.saldo);
            }
            else if(opcao == 4) {
            	System.out.println("sua conta rende R$" + c1.calculaRendimento() + " por mês");
            }
            else if(opcao == 5) {
            	System.out.println(c1.mostrarDados());
            }
            else if(opcao == 6) {   
            }
            else{
                System.out.println("Esse opção é invalida!");
            }
        }
        teclado.close();
	}

}
