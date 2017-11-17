package br.com.projetox.classes;

public class ContaMetodo {

	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println(cliente + " seu saldo é: " + saldo);
	}

	void saca(double valor) {
		saldo -= valor;
	}

	void deposita(double valor) {
		saldo += valor;
	}

	void trasnferePara(ContaMetodo destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}
