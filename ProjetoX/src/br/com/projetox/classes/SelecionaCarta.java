package br.com.projetox.classes;

import java.util.Random;

public class SelecionaCarta {

	public void Baralho(){
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
		String[] naipes ={"Espadas","Paus","Copas","Ouros"};
		
		Random r = new Random();
		
		String face = faces[r.nextInt(faces.length)];
		
		String naipe = naipes[r.nextInt(naipes.length)];
		
		String carta = face + " " + naipe;
		System.out.println(carta);
	}
}
