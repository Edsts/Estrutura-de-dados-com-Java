package Sequencial;

public class ListaSequencial {
	private final static int TAMANHO_LISTA = 50;

	public static void main(String[] args) {
		
		final int TAMANHO_LISTA = 50;
		
		int[] lista = new int[TAMANHO_LISTA];
		
		lista[0] = 10;
		lista[1] = 20;
		lista[2] = 25;
	
		
		System.out.println("Item 0 da lista : " + lista[0]);
		System.out.println("Item 1 da lista :"+ lista[1]); 
		System.out.println("Item 2 da lista :" + lista[2]); 

	}
}
