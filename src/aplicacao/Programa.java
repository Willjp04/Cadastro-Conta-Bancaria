package aplicacao;

import java.util.Scanner;
import entidades.DadosBanco;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CADASTRO DE CONTA BANC�RIA ");

		System.out.print("INSIRA O N�MERO DA CONTA ");

		int numeroDaConta = sc.nextInt();

		sc.close();

	}

}
