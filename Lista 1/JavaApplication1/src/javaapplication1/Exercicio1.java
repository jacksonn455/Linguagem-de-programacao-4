/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Avell
 */
public class Exercicio1 extends Thread {

    public static void main(String[] args) {
        
        final int Threads_Contador = 100;

        CMensagem Mensagens[] = new CMensagem[Threads_Contador];

        for (int i = 0; i < Threads_Contador; i++) {
            Mensagens[i] = new CMensagem(i);
        }

        System.out.println("Iniciando as Threads..");

        ExecutorService threadExecutor = Executors.newFixedThreadPool(Threads_Contador);

        for (int i = 0; i < Threads_Contador; i++) {
            threadExecutor.execute(Mensagens[i]);
        }

        threadExecutor.shutdown();
    }
}
