package pacote.teste;

import java.util.Scanner;

public class Calculo_de_Area {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    float hp;
	    float lp;
	    float ha;
	    float la;
	    float parede;
	    float azulejo;
	    float quantidade;
	    
	    System.out.print("Digite a altura da parede: ");
	    hp = teclado.nextFloat();
	    System.out.print("Digite a largura da parede: ");
	    lp = teclado.nextFloat();
	    System.out.print("Digite a altura do azulejo: ");
	    ha = teclado.nextFloat();
	    System.out.print("Digite a largura do azulejo: ");
	    la = teclado.nextFloat();
	    
	    //area da parede
	    parede = hp*lp;
	    //area do azulejo
	    azulejo = ha*la;
	    //quantidade de azulejos
	    quantidade = parede/azulejo;

	    System.out.println("você irá precisar de " + quantidade + " azulejos de " + ha + "m por " + la + "m para cobrir a parede!");

	    teclado.close();
	}

}
