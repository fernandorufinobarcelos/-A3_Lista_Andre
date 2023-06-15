package pacote.teste;

import java.util.Scanner;

public class Boletim {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		float n1;
		float n2;
		float n3;
		float n4;
		float n5;
		float total;
		
		System.out.print("Digite o nome do aluno: ");
		nome = teclado.nextLine();
		System.out.print("Digite a primeira nota(máximo 20 pontos): ");
		n1 = teclado.nextFloat();
		System.out.print("Digite a segunda nota(máximo 20 pontos): ");
		n2 = teclado.nextFloat();
		System.out.print("Digite a terceira nota(máximo 20 pontos): ");
		n3 = teclado.nextFloat();
		System.out.print("Digite a quarta nota(máximo 20 pontos): ");
		n4 = teclado.nextFloat();
		System.out.print("Digite a quinta nota(máximo 20 pontos): ");
		n5 = teclado.nextFloat();
		
		total = n1+n2+n3+n4+n5;
		
		if(total < 40) {
			System.out.println("O aluno "+ nome +" foi reprovado!");
		}
		else if(total >= 60) {
			System.out.println("O aluno "+ nome +" foi aprovado!");
		}
		else {
			System.out.println("O aluno "+ nome +" está de recuperação!");
		}
		
		teclado.close();
	}

}