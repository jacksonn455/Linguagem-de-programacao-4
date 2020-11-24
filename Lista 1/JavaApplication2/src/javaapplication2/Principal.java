package javaapplication2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

class Count extends Thread {

    Count() {
        System.out.println("Iniciando as threads...");
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                Date hora = Calendar.getInstance().getTime(); 
                String dataFormatada = sdf.format(hora);
              
                Random gerador = new Random();

                int k = gerador.nextInt(26);

                System.out.println(dataFormatada);
                Thread.sleep(5000);
                System.out.println("Noticia " + k);
                Thread.sleep(5000);
                System.out.println("Noticia " + i);
                if (i == 5) {
                    System.exit(-1);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("A thread parou");
        }

    }
}

class ExtendingExample {

    public static void main(String args[]) {
        Count cnt = new Count();
        try {
            while (cnt.isAlive()) {
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("A thread parou");
        }
    }
}
