package javaapplication6;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CavaloThreadTeste extends Thread {

    public static void main(String args[]) throws InterruptedException {
        Random gerador = new Random();

        int gerargerar = gerador.nextInt(10);
        double dist = 1000.0;
        Thread.sleep(3000);
        CavaloThread s1 = new CavaloThread("Cavalo1", gerargerar, 0.0, dist);
        Thread.sleep(3000);
        CavaloThread s2 = new CavaloThread("Cavalo2", gerargerar, 0.0, dist);
        Thread.sleep(3000);
        CavaloThread s3 = new CavaloThread("Cavalo3", gerargerar, 0.0, dist);

        ExecutorService threadExecutor = Executors.newFixedThreadPool(3);
        threadExecutor.execute(s1);
        threadExecutor.execute(s2);
        threadExecutor.execute(s3);

        threadExecutor.shutdown();
    }

}
