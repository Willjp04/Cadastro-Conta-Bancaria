package entidade;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	// CONSTRUTOR PARA CLIENTE COM DEP�SITO
	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		// CHAMANDO O M�TODO DEP�SITO
		deposito(depositoInicial);
	}

	// CONSTRUTOR PARA CLIENTE SEM DEP�SITO

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;

	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	// M�TODO PARA DEP�SITO
	public void deposito(double quantia) {
		saldo += quantia;
	}

	// M�TODO PARA SAQUE
	public void saque(double quantia) {
		saldo -= quantia + 5.00;

	}
	
	public String toString() {
		return
		"CONTA "
		+ numero
		+ ", "
		+ "TITULAR: "
		+ titular
		+", "
		+ "SALDO EM CONTA: "
		+ saldo;
	}
	

}
