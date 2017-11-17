package br.com.projetox.classes;

public class CalculaArea {

	/**
	 * calcula area do quadrado
	 * @param lado
	 * @return area do Quadrado
	 */
	double quadrado(double lado) {
		return lado * lado;	
	}
	/**
	 * Calcula a are do retangulo Basicamente a mesma formula do
	 * quadrado porem deixei separado para vizualizar melhor
	 * @param base
	 * @param altura
	 * @return area do retangulo
	 */
	double retangulo (double base, double altura) {
		return base * altura;
	}
	/**
	 * Calcula a area do triangulo
	 * @param base
	 * @param altura
	 * @return area do trinagulo
	 */
	double triangulo(double base, double altura) {
		return (base * altura)/2;
	}
	
	/**
	 * Calcula a area do losango Basicamente a mesma formula do
	 * quadrado porem deixei separado para vizualizar melhor
	 * @param base
	 * @param altura
	 * @return area do losango
	 */
	double losango(double base, double altura) {
		return base * altura;
	}
	/**
	 * Calcula a area do trapezio 
	 * @param base
	 * @param altura
	 * @return area do trapezio
	 */
	double trapezio(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor )* altura)/2;
	}
	/**
	 * Calcula a area do circulo 
	 * @param base
	 * @param altura
	 * @return area do circulo
	 */
	double circulo(double raio) {
		double  PI =3.14;
		return PI*(raio*raio);
	}
}
