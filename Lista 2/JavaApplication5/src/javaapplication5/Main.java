package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final int LIMIT = 2;

    public static void main(String[] args) {
        List<Integer> ordenation = listShuffler(LIMIT);

        System.out.println(ordenation);

        ExecutorService application = Executors.newFixedThreadPool(LIMIT);
        Conta conta = new Conta(10000.0);
        synchronized (application) {
            synchronized (conta) {
                for (int i = 0; i < LIMIT; i++) {
                    if (ordenation.get(i) % 2 == 0) {
                        application.execute(new ThreadCredito(conta));
                    } else if (ordenation.get(i) % 2 == 1) {
                        application.execute(new ThreadDebito(conta));
                    }
                }
            }
        }
    }

    public static List<Integer> listShuffler(int limit) {
        List<Integer> ordenation = new ArrayList<Integer>();

        for (int i = 1; i <= limit; i++) {
            ordenation.add(i);
        }
        Collections.shuffle(ordenation);

        return ordenation;
    }
}
