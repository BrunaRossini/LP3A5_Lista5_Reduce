package lista5.exercicio2;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.Optional;

public class Exercicio2 {

	public static void main(String[] args) {
		List<String> nomes = asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		System.out.println("Lista:" + nomes + "\n");
		// Mostre a concatena��o dos nomes que come�am com P
		Optional<String> verificarP = nomes.stream().filter(e -> e.startsWith("P")).reduce((s1, s2) -> s1.concat(s2));
		System.out.println("Nomes que come�am com a Letra P: " + verificarP.get() + "\n");
		// Mostre a concatena��o dos nomes que come�am com A
		Optional<String> verificarA = nomes.stream().filter(e -> e.startsWith("A")).reduce((s1, s2) -> s1.concat(s2));
		System.out.println("Nomes que come�am com a Letra A: " + verificarA.get() + "\n");
		// Mostre a concatena��o de todos os nomes
		Optional<String> concatenarTodos = nomes.stream().reduce((s1, s2) -> s1.concat(s2));
		System.out.println("Concatena��o de todos os nomes: " + concatenarTodos.get() + "\n");

	}

}
