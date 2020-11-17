import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javaapplication4.T1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Avell
 */
public class Exercicio4 {

    public static void main(String[] args) {
        T1 arrayThreads[] = new T1[5];

        for (int i = 0; i < arrayThreads.length; i++) {
            arrayThreads[i] = new T1(i);
        }

        System.out.println("iniciando as threads...");

        ExecutorService threadExecutor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < arrayThreads.length; i++) {
            threadExecutor.execute(arrayThreads[i]);
        }
        threadExecutor.shutdown();
    }
}
