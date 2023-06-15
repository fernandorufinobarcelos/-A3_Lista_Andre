package pacote.teste;

import java.util.Scanner;

public class Urna {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int voto = 0;
		int op = 1;
		int voto1[] = new int[5];
		int n;
		int total;
		float media;
		int maior1 = 0;
		int maior2 = 0;
		String candidato1 = "0";
		int votoc1 = 0;
		int num1 = 0;
		String candidato2 = "0";
		int votoc2 = 0;
		int num2 = 0;
		int voto2 = 0;
		int voto3 = 0;
		int maior3 = 0;
		int total2;
		
		
		System.out.println("Bem-vindo à urna!");
		while(op != 2) {
			System.out.println("----------------------------");
			System.out.println("| Candidatos      | Número |");
			System.out.println("----------------------------");
			System.out.println("| Ciro Gomes      |   12   |");
			System.out.println("----------------------------");
			System.out.println("| Felipe D Avila  |   30   |");
			System.out.println("----------------------------");
			System.out.println("| Jair Bolsonaro  |   22   |");
			System.out.println("----------------------------");
			System.out.println("| Lula            |   13   |");
			System.out.println("----------------------------");
			System.out.println("| Léo Péricles    |   80   |");
			System.out.println("----------------------------");
			System.out.println("Selecione seu candidato: ");
			voto = teclado.nextInt();
			
			if(voto == 12){
				voto1[0]++;
			}
			else if(voto == 30) {
				voto1[1]++;
			}
			else if(voto == 22) {
				voto1[2]++;
			}
			else if(voto == 13) {
				voto1[3]++;
			}
			else if(voto == 80) {
				voto1[4]++;
			}
			else {
				System.out.println("Número invalido, tente novamente");
			}
			System.out.println("Deseja votar novamente? (1)Sim (2)Nâo");
			op = teclado.nextInt();
			
		}
		op = 1;
		
		total = voto1[0]+voto1[1]+voto1[2]+voto1[3]+voto1[4];
		media = total/2;
		
		//maior1
		for(int cont = 0; cont < 5; cont++) {
			n = 0;			
			for(int cont1 = 0; cont1 < 5; cont1++) {
				
				if(voto1[cont] < voto1[cont1]) {
					n++;
				}
				
			}
			if(n == 0) {
				maior1 = voto1[cont];
			}
		}
		
		//maior2
		for(int cont = 0; cont < 5; cont++) {
			n = 0;
			for(int cont1 = 0; cont1 < 5; cont1++) {
				
				if(voto1[cont] < voto1[cont1]) {
					n++;
				}
				
			}
			if(n == 1) {
				maior2 = voto1[cont];
			}
		}
		//maior1
		if(maior1 == voto1[0]) {
			candidato1 = "Ciro Gomes    ";
			num1 = 12;
			votoc1 = voto1[0];
		}
		else if(maior1 == voto1[1]) {
			candidato1 = "Felipe D Avila";
			num1 = 30;
			votoc1 = voto1[1];
		}
		else if(maior1 == voto1[2]) {
			candidato1 = "Jair Bolsonaro";
			num1 = 22;
			votoc1 = voto1[2];
		}
		else if(maior1 == voto1[3]) {
			candidato1 = "Lula          ";
			num1 = 13;
			votoc1 = voto1[3];
		}
		else if(maior1 == voto1[4]) {
			candidato1 = "Léo Péricles  ";
			num1 = 80;
			votoc1 = voto1[4];
		}
		
		if(maior1 <= media) {
			
			
			//maior2
			if(maior2 == voto1[0]) {
				candidato2 = "Ciro Gomes    ";
				num2 = 12;
				votoc2 = voto1[0];
			}
			else if(maior2 == voto1[1]) {
				candidato2 = "Felipe D Avila";
				num2 = 30;
				votoc2 = voto1[1];
			}
			else if(maior2 == voto1[2]) {
				candidato2 = "Jair Bolsonaro";
				num2 = 22;
				votoc2 = voto1[2];
			}
			else if(maior2 == voto1[3]) {
				candidato2 = "Lula          ";
				num2 = 13;
				votoc2 = voto1[3];
			}
			else if(maior2 == voto1[4]) {
				candidato2 = "Léo Péricles  ";
				num2 = 80;
				votoc2 = voto1[4];
			}
			
			System.out.println("Iniciando a segunda fase da votação:");
			
			while(op != 2) {
				System.out.println("-------------------------");
				System.out.println("| Candidatos | Númeoros |");
				System.out.println("-------------------------");
				System.out.println("| " + candidato1 + " | " + num1  + " |");
				System.out.println("-------------------------");
				System.out.println("| " + candidato2 + " | " + num2 + " |");
				System.out.println("-------------------------");
				System.out.println("Selecione seu candidato: ");
				voto = teclado.nextInt();
				
				if(voto == num1) {
					voto2++;
				}
				else if(voto == num2) {
					voto3++;
				}
				System.out.println("Deseja votar novamente? (1)Sim (2)Não");
				op = teclado.nextInt();
				
			}
			total2 = voto2+voto3;
			maior3 = Math.max(voto2, voto3);
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("Durante a primeira fase os dois maiores candidartos foram: ");
			System.out.println(candidato1 + " com " + votoc1 + " votos");
			System.out.println(candidato2 + " com " + votoc2 + " votos");
			System.out.println("com um total de votos " + total);
			if(maior3 == voto2) {
				
			}
			else if(maior3 == voto3) {
				candidato1 = candidato2;
			}
			
			System.out.println("------------------------------------------------------------");
			System.out.println("Durante a segunda fase o maior candidato foi: ");
			System.out.println(candidato1 + " com " + maior3);
			System.out.println("com um total de votos " + total2);
		}
		
		if(voto2 == 0 && voto3 == 0) {
			System.out.println("------------------------------------------------------------");
			System.out.println("Durante a primeira fase o maior candidato foi: ");
			System.out.println(candidato1 + " com " + votoc1 + " votos");
			System.out.println("com um total de votos " + total);
		}
		
		teclado.close();
	}
}