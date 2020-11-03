package javaapplication5;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTeste extends Thread {

    public static void main(String args[]) throws InterruptedException {

        Random gerador = new Random();

        int gerargerar = gerador.nextInt(15);
        int gerarCinco = gerador.nextInt(50);
        ParThread p1 = new ParThread(1, gerargerar);
        ImparThread p2 = new ImparThread(1, gerargerar);
        CincoThread p3 = new CincoThread(1, gerarCinco);

        System.out.println("Iniciando threads");

        ExecutorService threadExecutor = Executors.newFixedThreadPool(3);

        threadExecutor.execute(p1);
        System.out.println("");
        Thread.sleep(3000);
        threadExecutor.execute(p2);
        Thread.sleep(2000);
        System.out.println("");
        threadExecutor.execute(p3);
        Thread.sleep(5000);
        threadExecutor.shutdown();

    }

}
