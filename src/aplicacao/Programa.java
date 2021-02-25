package aplicacao;

import entidade.Conta;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
		System.out.println("CADASTRO DE CONTA BANCÁRIA ");

		// DAR ESPAÇO
		System.out.println();

		System.out.print("INSIRA O NÚMERO DA CONTA ");
		int numero = sc.nextInt();

		System.out.print("INSIRA O NOME DO TITULAR DA CONTA ");
		sc.nextLine();
		String titular = sc.nextLine();

		System.out.print("Existe um depósito inicial (s/n) ? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("INSIRA O VALOR DE DEPÓSITO INICIAL ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
		}

		System.out.println();
		System.out.println("DADOS DA CONTA ");

		System.out.println(conta);

		System.out.println();

		System.out.print("INSIRA O VALOR PARA DEPÓSITO :");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);

		System.out.println(conta);

		System.out.println();

		System.out.print("INSIRA O VALOR PARA SAQUE: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println();
		
		System.out.println(conta);

		sc.close();

	}

}
