package Fila;

import Itens.Item;

public class Principal {

	public static void main(String[] args) {
		
		Fila fila = new Fila(); 
		
		Item item = new Item("Ednaldo");

		Item item2 = new Item("Osvaldo");

		fila.inserirItemNaFila(item);
		fila.inserirItemNaFila(item2);
		
		fila.removerItemDaFila();
		
		fila.listar();
		
	}
}
