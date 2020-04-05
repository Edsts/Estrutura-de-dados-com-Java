package Itens;

import java.lang.reflect.Constructor;

public class Item {
	
	private String nome;
	
	public Item(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
