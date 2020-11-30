package JavaApplication3.processors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ExercicioTres implements Runnable{
	private int prioridade;
	
	
	public ExercicioTres(int prioridade) {
		this.prioridade = prioridade;
	}
	
	@Override
	public void run() {
		try {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");  
			System.out.println("Thread executada em " + dtf.format(now) + " com prioridade " + this.getPrioridade());
			Thread.currentThread().setPriority(this.getPrioridade());
		} catch (Exception e) {
			System.out.println("caso de erro: " + e.getMessage());
		}	
	}

	public int getPrioridade() {
		return prioridade;
	}

	
}
