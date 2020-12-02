package javaapplication4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTeste extends Thread {

    public static void main(String args[]) throws InterruptedException {

        UmAoCincoThread p1 = new UmAoCincoThread(1, 5);
        DezThread p2 = new DezThread(5, 10);
        ParDoVinteAoCinquenta p3 = new ParDoVinteAoCinquenta(20, 50);
        
        System.out.println("Iniciando threads");

        ExecutorService threadExecutor = Executors.newFixedThreadPool(3);

        threadExecutor.execute(p1);
        System.out.println("");
        Thread.sleep(1000);
        threadExecutor.execute(p2);
        Thread.sleep(1000);
        System.out.println("");
        threadExecutor.execute(p3);
        Thread.sleep(1000);
        threadExecutor.shutdown();
    }

}
