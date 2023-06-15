package pacote.teste;


public class Conta {
	
	public String titular;
	public int numero;
	public String agencia;
	public double saldo = 0;
	public String dataDeAbertura;
	
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			System.out.println("O valor digitado é maior que seu saldo");
			return false;
		}
		else {
			this.saldo -= valor;
			System.out.println("Você sacou R$" + valor);
			return true;
		}
	}
	public boolean depositar(double valor) {
		this.saldo +=valor;
		System.out.println("Você depositou R$" + valor);
		return true;
	}
	public double calculaRendimento() {
		return (saldo*0.1);
	}
	
    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$" + this.saldo;
        dados += "\nData de abertura: " + this.dataDeAbertura;
        return dados;
    }
    public String mostrarDados() {
    	System.out.println("O titular da conta: " + this.titular);
    	System.out.println("O numero da conta: " + this.numero);
    	System.out.println("A agencia da conta: " + this.agencia);
    	System.out.println("A data de abertuda da conta: " + this.dataDeAbertura);
    	return "";
    	
    }
	

}
