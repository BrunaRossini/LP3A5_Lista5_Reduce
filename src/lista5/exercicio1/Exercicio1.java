package lista5.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;

public class Exercicio1 {

	public static void main(String[] args) {

		Random gerarNumeros = new Random();
		Integer[] gerar = new Integer[100];

		for (int i = 0; i <= 10; i++) {
			gerar[i] = (gerarNumeros.nextInt(100) + 1);
			System.out.println("Valor Gerado: " + gerar[i]);

		}

		List<Integer> lista = Arrays.asList(gerar);
		lista.stream().forEach(System.out::println);
		// Soma
		Optional<Integer> reduce = lista.stream().reduce((n1, n2) -> n1 + n2);
		System.out.println("Soma" + reduce.get());
		// Multiplicação
		Optional<Integer> reduceMultiplicacao = lista.stream().reduce((n1, n2) -> n1 * n2);
		System.out.println("Multiplicação: " + reduceMultiplicacao.get());
		// Menor Valor
		OptionalDouble  menorValor = ((DoubleStream) lista).reduce((d1, d2) -> Math.min(d1, d2));
		System.out.println("Menor Valor: " + menorValor.getAsDouble());
		// Maior Valor
		OptionalDouble maiorValor = ((DoubleStream) lista).reduce((d1, d2) -> Math.max(d1, d2));
		System.out.println("Menor Valor: " + maiorValor.getAsDouble());

	}

}
