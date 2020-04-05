package Pilha;

import Itens.Item;

public class Pilha {

	NodePilha topo;

	public void inserirItemNaPilha(Item item) {

		NodePilha novoNo = new NodePilha();
		novoNo.item = item;
		novoNo.noAnterior = topo;
		topo = novoNo;
	}

	public Item removerItemNaPilha() {
		if (topo != null) {

			Item itemRemovido = topo.item;
			topo = topo.noAnterior;

			System.out.println(" \n m--------- Item removido -------- ");
			System.out.println(itemRemovido.getNome());
			
			return itemRemovido;
		} else {
			return null;
		}
	}

	public void listarPilha() {
		NodePilha noAuxiliar = topo;

		while (noAuxiliar != null) {
			System.out.println(noAuxiliar.item.getNome());
			noAuxiliar = noAuxiliar.noAnterior;
		}
	}
}
