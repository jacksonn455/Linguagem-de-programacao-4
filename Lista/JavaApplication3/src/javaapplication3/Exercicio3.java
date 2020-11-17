/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Avell
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Random generator = new Random();
        //int dimensao = generator.nextInt( 5+2 );
        int dimensao = 4;

        int matriz[][] = new int[dimensao][dimensao];
        ThreadSoma threadSomadoras[] = new ThreadSoma[dimensao];

        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                matriz[i][j] = generator.nextInt(10);
            }
        }

        System.out.println("A matriz gerada é.... ");

        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                System.out.printf("%d", matriz[i][j]);
            }
            System.out.println();
        }
        
        for (int i = 0; i < dimensao; i++) {
            threadSomadoras[i] = new ThreadSoma(i, dimensao, matriz);
        }
        
        System.out.println("\n iniciando as Threads... \n");
        
        ExecutorService threadExecutor = Executors.newFixedThreadPool(dimensao);
        
        for (int i = 0; i < dimensao; i++) {
            threadExecutor.execute(threadSomadoras[i]);
        }
        
        threadExecutor.shutdown();
    }
}
