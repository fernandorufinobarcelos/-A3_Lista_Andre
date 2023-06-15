package pacote.teste;

import java.util.Scanner;

public class Conversor_de_Temperatura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int r;
		Double temp;
		
		
		
		
		System.out.println("Bem-Vindo ao conversor de temperaturas");
		System.out.println("Você deseja converter (1)Celsius para Fahrenheit ou (2)Fahrenheit para Celsius?");
		r = teclado.nextInt();
		System.out.print("Digite a temperatura: ");
		temp = teclado.nextDouble();
		
		if(r == 1){
			temp = temp * 1.8 + 32;
			System.out.println("A temperatura Digitada em Fahrenheit é: " + temp);
		}
		else if(r == 2){
			temp = (temp-32)/1.8;
			System.out.println("A temperatura Digitada em Celsius é: " + temp);
		}
		else {
			System.out.println("A opção digitada é invalida");
		}
		
		teclado.close();
	}
}
