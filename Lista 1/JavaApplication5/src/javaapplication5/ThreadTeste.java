package javaapplication5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTeste extends Thread {

    public static void main(String args[]) throws InterruptedException {

        Random gerador = new Random();

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime();
        String dataFormatada = sdf.format(hora);
        int gerargerar = gerador.nextInt(15);
        int gerarCinco = gerador.nextInt(50);
        ParThread p1 = new ParThread(1, gerargerar);
        ImparThread p2 = new ImparThread(1, gerargerar);
        CincoThread p3 = new CincoThread(1, gerarCinco);
        int espera = 0;
        
        System.out.println("Iniciando threads");

        ExecutorService threadExecutor = Executors.newFixedThreadPool(3);

        threadExecutor.execute(p1);
        System.out.println("");
        Thread.sleep(3000);
        espera = espera +1;
        threadExecutor.execute(p2);
        Thread.sleep(2000);
        espera = espera +1;
        System.out.println("");
        threadExecutor.execute(p3);
        Thread.sleep(5000);
        espera = espera +1;
        threadExecutor.shutdown();
        System.out.println("Quantas vezes as threads entraram no modo de espera: " + espera);
        System.out.println(dataFormatada);

    }

}
