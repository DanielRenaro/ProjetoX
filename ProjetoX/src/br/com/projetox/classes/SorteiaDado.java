package br.com.projetox.classes;

import java.util.Random;

public class SorteiaDado {

	String Sorteando(int palpite) {
		int conta = 0, contaA = 0, contaE = 0, saida = 0;
		int dado = 0;

		while (saida != 1) {
			Random n = new Random();
			dado = n.nextInt(6) + 1; // 0-5
			conta++;
			if (palpite == dado) {
				System.out.println("Dado = " + dado);
				System.out.println("Acertou.");
				saida = 1;
				contaA++;
			} else {
				contaE++;
				System.out.println("Dado = " + dado);
			}
		}
		String result = "Palpite = " + palpite + ", " + ""
				+ "Tentativas = " + conta + ", Acertos = " + contaA
				+ ", Erros = " + contaE;

		return result;
	}
}
