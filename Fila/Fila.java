package Fila;
// Implementação de uma fila com lista encadeada

import Itens.Item;

public class Fila { 
	
	Node primeiroNo;
	Node ultimoNo;
	
	public void inserirItemNaFila(Item item) {
		
		Node novoNo = new Node();
		novoNo.item = item;
		
		if(primeiroNo != null) {
			primeiroNo.proximoNo = novoNo;
			ultimoNo = novoNo;
		} else {
			primeiroNo = novoNo;
			ultimoNo = novoNo;
		}
	}
	
	public Item removerItemDaFila() {
		
		if(primeiroNo != null) {
			Item itemRemovido = primeiroNo.item;
			primeiroNo = primeiroNo.proximoNo;
			return itemRemovido;
		} else {
			return null;
		}
	}
	
	public void listar() {
		Node noAuxiliar = primeiroNo;
		
		while(noAuxiliar != null) {
			System.out.println(noAuxiliar.item.getNome());
			noAuxiliar = noAuxiliar.proximoNo;
		}
	}
}
