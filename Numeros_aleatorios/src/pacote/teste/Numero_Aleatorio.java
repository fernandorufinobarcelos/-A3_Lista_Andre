package pacote.teste;

import java.util.Random;

public class Numero_Aleatorio {

	public static void main(String[] args) {
	    
		Random random = new Random();
	    
	    int par=0;
	    int impar=0;
	    int num;
	    int soma = 0;
	    
	    for(int cont=0;cont<100;cont++){
	    	int n1=random.nextInt(99999);
	    	soma += n1;	
	    	num = cont+1;
	        System.out.println("Número " + num + ": " + n1);
	        
	        if(n1%2==0){
	        	par++;
	        }
	        else{
	        	impar++;
	        }
	    }
	    System.out.println("-----------------------------------");
	    System.out.println("Existem " + impar + " números ímpares");
	    System.out.println("Existem " + par + " números pares");
	    System.out.println("A soma de todos os números gerados é: " + soma);
	}

}
