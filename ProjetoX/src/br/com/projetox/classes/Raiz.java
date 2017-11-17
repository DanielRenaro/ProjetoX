package br.com.projetox.classes;
/**
 * Classe de raiz
 * @author Daniel
 *
 */
public class Raiz {

	/**
	 *  Só considera a parte inteira da raiz
	 * @param numero inteiro
	 * @return a raiz quadrada
	 */
	int raiz2 (int numero) {
		int raiz = 0, impar = 1;				
		while(numero >= impar) {
			numero -= impar;
			impar += 2; // próximo número impar
			++raiz;
		}
		
		return raiz;
	}
	
	/**
	 *  
	 * @param numero double
	 * @return a raiz cubica
	 */
	double raiz3(double numero) {
		double raizc = Math.cbrt(numero);
		return raizc;
	}
	
	
}
