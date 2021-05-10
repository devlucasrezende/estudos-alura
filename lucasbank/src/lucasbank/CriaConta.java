package lucasbank;

import java.util.Scanner;

public class CriaConta {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ol�, seja bem vindo(a) ao Lucas'Bank");
		Conta c1 = new Conta();
		c1.criaConta();
		System.out.println("Seja bem vindo(a) " +c1.titular+ ". Informamos que todas as agencias s�o de n. " +c1.agencia);
		System.out.println("");
		System.out.println("Informe qual o valor inicial que ser� depositado em sua conta :");
		c1.saldo = scanner.nextDouble();
		System.out.println("Ok, seu saldo atual �: R$" +c1.saldo);
		System.out.println("Voc� pode depositar mais dinheiro, sacar dinheiro ou transferir dinheiro. O que voc� gostaria de fazer? Escolha entre: sacar, depositar ou transferir");
		String opcoes = scanner.next();
		
		switch (opcoes) {
		case "sacar":
			System.out.println("Qual o valor voc� quer sacar?");
			double valorSaque = scanner.nextInt();
			c1.saca(valorSaque);
			System.out.println("Tudo bem, seu saldo atual �: R$" +c1.saldo);
			
		case "depositar":
			System.out.println("Qual o valor voc� quer depositar?");
			double valorDeposita = scanner.nextDouble();
			c1.deposita(valorDeposita);
			System.out.println("Tudo bem, seu saldo atual �: R$" +c1.saldo);
		}
		
		
		
		
		
		
		scanner.close();
	}

}
