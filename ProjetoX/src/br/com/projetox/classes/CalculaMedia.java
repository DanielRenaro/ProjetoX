package br.com.projetox.classes;

import java.util.Scanner;

public class CalculaMedia {

	double MediaUmAluno(double nota1, double nota2) {
		double media = 0;
		media = (nota1 * 0.4) + (nota2 * 0.6);
		return media;
	}
	String MediaUmaTurma(int numAlunos) {
		double mediaTurma = 0;
		for (int i = 0; i < numAlunos; i++) {
			// Media dos alunos
			Scanner s = new Scanner(System.in);
			System.out.println("Entre com a nota: ");
			double media = s.nextDouble();
			mediaTurma = mediaTurma + media;
		}
		mediaTurma = mediaTurma / numAlunos;
		String media = "A média dessa turma com " + numAlunos + " alunos é : " + mediaTurma;

		return media;
	}
	double MediaQuatroProvas(double nota1, double nota2,double nota3, double nota4) {
		double media = 0;
		media = (nota1 + nota2 + nota3 + nota4)/4;
		return media;
	}
	
}
