package LinkedList;
import java.util.LinkedList;

public class ImplLinkedList {
	
	public static void main(String[] args) {
		LinkedList <String> nomes = new LinkedList<String>();
		nomes.add("Ednaldo");
		nomes.add("Elaine");
		nomes.add("Osvaldo");
		nomes.add("Anderson");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}
}
