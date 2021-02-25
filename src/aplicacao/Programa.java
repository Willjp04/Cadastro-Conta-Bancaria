package aplicacao;

import java.util.Scanner;
import entidades.DadosBanco;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CADASTRO DE CONTA BANCÁRIA ");

		System.out.print("INSIRA O NÚMERO DA CONTA ");

		int numeroDaConta = sc.nextInt();

		sc.close();

	}

}
