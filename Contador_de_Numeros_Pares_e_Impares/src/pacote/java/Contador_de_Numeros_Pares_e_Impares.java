package pacote.java;

import java.util.Scanner;

public class Contador_de_Numeros_Pares_e_Impares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int cont = 1;
		int quant;
		int n;
		int par = 0;
		int impar = 0;
		
		System.out.println("Digite quantos números você deseja digitar");
		quant = teclado.nextInt();
		
		while(cont <= quant){
			System.out.print("Digite o " + cont + " número inteiro positivo: ");
			n = teclado.nextInt();
			
			if(n%2 == 0) {
				par++;
			}
			else {
				impar++;
			}
			cont++;
		}
		System.out.println("Você digitou " + par + " números pares");
		System.out.println("Você digitou "+ impar + " números impares");
		
		teclado.close();
	}

}