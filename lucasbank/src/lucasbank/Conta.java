package lucasbank;

import java.util.Random;
import java.util.Scanner;

public class Conta {
	
	
	double saldo;
	final String agencia = "0001";
	String titular;
	int numeroConta;
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void transfere (double valor, Conta destino) {
		if(this.saldo >= valor) {
			destino.deposita(valor);
		}
	}
	
	public void saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo -=  valor;
		}
	}
	
	public void criaConta () {
		System.out.println("Informe seu nome para que seja criada uma conta");
		this.titular = scanner.next();
		int numeroConta = random.nextInt(100);
		System.out.println("O número de sua conta é: " +numeroConta);
	}
	

}

