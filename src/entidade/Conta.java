package entidade;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	// CONSTRUTOR PARA CLIENTE COM DEPÓSITO
	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		// CHAMANDO O MÉTODO DEPÓSITO
		deposito(depositoInicial);
	}

	// CONSTRUTOR PARA CLIENTE SEM DEPÓSITO

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

	// MÉTODO PARA DEPÓSITO
	public void deposito(double quantia) {
		saldo += quantia;
	}

	// MÉTODO PARA SAQUE
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
