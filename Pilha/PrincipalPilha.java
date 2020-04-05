package Pilha;

import Itens.Item;

public class PrincipalPilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		Item item = new Item("Ednaldo");
		
		Item item2 = new Item("Miguel");

		Item item3 = new Item("Osvaldo");

		Item item4 = new Item("Daniel");
		
		pilha.inserirItemNaPilha(item);
		pilha.inserirItemNaPilha(item2);
		pilha.inserirItemNaPilha(item3);
		pilha.inserirItemNaPilha(item4);
		
		System.out.println("--------- Lista atual de itens da pilha, do topo para baixo ------------------");
		pilha.listarPilha();
		
		System.out.println("--------- Removendo itens...do topo para baixo ---------------------");
		pilha.removerItemNaPilha();
		pilha.removerItemNaPilha();

		
		System.out.println("\n-------- Lista após remoção de 2 itens -------------");
		pilha.listarPilha();
	}
}
