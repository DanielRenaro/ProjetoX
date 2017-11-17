package br.com.projetox.classes;
/**
 *  Classe de operadores basicos + - / *
 * @author Daniel
 *
 */
public class OperacaoBasica {

	/**
	 * Soma dois valores
	 * 
	 * @param um
	 * @param dois
	 * @return a soma dos dois valores
	 */
	double soma(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}

	/**
	 * Subtrai dois valores
	 * 
	 * @param um
	 * @param dois
	 * @return a Subtração de dois valores
	 */
	double subtracao(double num1, double num2) {
		double sub = num1 - num2;
		return sub;
	}

	/**
	 * 
	 * @param numero
	 * @return a divisão de dois valores
	 */
	double divisao(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}

	/**
	 * 
	 * @param numero
	 * @return a multiplicaçõa de dois valores
	 */
	double multiplicacao(double num1, double num2) {
		double multi = num1 * num2;
		return multi;

	}
}
