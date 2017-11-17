package br.com.projetox.classes;

public class Fibonacci {

	public String FibonacciCalc(int numero) {

		String sequencia = ""; 
		int num = 0, num1 = 1;
		int aux = 0;
		sequencia = sequencia + num + ", \n" + num1 + ", \n";
		while (aux < numero) {
			aux = num + num1;
			num = num1;
			num1 = aux;
			sequencia += aux + ", \n";
		}
		return sequencia;
	}
}