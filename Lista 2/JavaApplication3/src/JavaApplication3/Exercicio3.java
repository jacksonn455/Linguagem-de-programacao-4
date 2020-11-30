package JavaApplication3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import JavaApplication3.processors.ExercicioTres;

public class Exercicio3 {
	private static int getGerarRamdon(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("O valor maximo deve ser maior que o minimo");
		}

		Random gerarRandomico = new Random();
		return gerarRandomico.nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<Thread>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Digite o número de threads: ");
		
		List<ExercicioTres> processors = new ArrayList<ExercicioTres>();

		String input = scanner.nextLine();
		int threadCount = Integer.parseInt(input);

		ExecutorService application = Executors.newFixedThreadPool(threadCount);
		for (int i = 0; i < threadCount; i++) {
			int prioridade = getGerarRamdon(1, 10);
			ExercicioTres processor = new ExercicioTres(prioridade);
			processors.add(processor);
		}

		Collections.sort(processors, (o1, o2) -> o1.getPrioridade() - o2.getPrioridade());

		for (ExercicioTres processor : processors) {
			Thread thread = new Thread(processor);
			threads.add(thread);
			thread.start();
		}

		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
