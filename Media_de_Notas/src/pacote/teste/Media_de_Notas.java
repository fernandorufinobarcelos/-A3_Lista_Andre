package pacote.teste;

import java.util.Scanner;

public class Media_de_Notas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int cont = 1;
		int qa;
		int cont1 = 0;
		double soma = 0;
		double media;
		
		System.out.println("Digite quantos alunos a turma possui: ");
		qa = teclado.nextInt();
		
		double na[] = new double[qa];
		
		while(cont <= qa) {
			System.out.println("Digite a nota do " + cont + " aluno: ");
			na[cont1] = teclado.nextDouble();
			
			soma += na[cont1];
			
			cont1 ++;
			cont++;
		}
		media = soma/qa;
		
		System.out.println("A media final da turma é: " + media);
		
		teclado.close();
	}

}
