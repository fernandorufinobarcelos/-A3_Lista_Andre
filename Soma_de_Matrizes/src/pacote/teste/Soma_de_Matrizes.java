package pacote.teste;

import java.util.Random;
import java.util.Scanner;

public class Soma_de_Matrizes {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int m;
		
		System.out.println("Selecione o tamanho das matrizes: ");
		m = teclado.nextInt();
		
		int matriz1[][] = new int[m][m];
		int matriz2[][] = new int[m][m];
		int matriz3[][] = new int[m][m];
		
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				int l = i+1;
				int c = j+1;
				System.out.println("Preencha a posiçâo da linha " + l + " e coluna " + c + " da primeira matriz");
				matriz1[i][j] = teclado.nextInt();
				
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				int l = i+1;
				int c = j+1;
				System.out.println("Preencha a posiçâo da linha " + l + " e coluna " + c + " da segunda matriz");
				matriz2[i][j] = teclado.nextInt();		
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		System.out.println("---------------------------------------------------------------------");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				int l = i+1;
				int c = j+1;
				System.out.println("A soma das matrizes na posição na linha " + l + " e coluna " + c + " é: ");
				System.out.println(matriz3[i][j]);
			}
		}
		
		teclado.close();
	}

}
