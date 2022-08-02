package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		Gato gato = new Gato();
		livros livros = new livros(); 
	
			System.out.println(gato);
			System.out.println(livros);
	}
}

class livros {
	private String nome;
	private String npag;
}