package entidade;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	// CONSTRUTOR PARA CLIENTE COM DEPÓSITO
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	// CONSTRUTOR PARA CLIENTE SEM DEPÓSITO

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
	
	
}
