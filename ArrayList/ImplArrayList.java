package ArrayList;
import java.util.ArrayList;

public class ImplArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Ednaldo");
		nomes.add("Elaine");
		nomes.add("Anderson");
		nomes.add("Osvaldo");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}

}
