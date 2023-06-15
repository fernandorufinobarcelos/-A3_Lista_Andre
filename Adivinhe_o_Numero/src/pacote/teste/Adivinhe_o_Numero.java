package pacote.teste;

import java.util.Scanner;
import java.util.Random;

public class Adivinhe_o_Numero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int n1 = aleatorio.nextInt(1,101);
		int n = 0;
		
		System.out.print("Digite um número de 1 a 100: ");
		while(n1 != n) {
			n = teclado.nextInt();
			if(n > n1) {
				System.out.println("O número é menor que " + n + ". Digite outro número");
			}
			else if(n < n1){
				System.out.println("O número é maior que " + n + ". Digite outro número");
			}
		}
		System.out.println("Parabéns você acertou o número");

			
		teclado.close();
	}

}