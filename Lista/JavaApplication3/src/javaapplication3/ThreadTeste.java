package javaapplication3;

import java.util.Random;
import javax.swing.JOptionPane;

public class ThreadTeste extends Thread {

    public static void main(String[] args) {
        Random gerador = new Random();
        int gerar = gerador.nextInt(10);
        int mat[][] = new int[gerar][gerar];
        int vet[] = new int[gerar];

        System.out.println("Matriz");

        for (int i = 0; i < 4; i++) {
            int gerargerar = gerador.nextInt(10);
            System.out.println(" ");
            for (int j = 0; j < 4; j++) {
                int v = gerargerar;
                mat[i][j] = v;
                System.out.print(v + " ");
            }
        }

        System.out.println(" ");
        System.out.println(" ");

        int soma;

        // Loop para percorrer as linhas
        for (int i = 0; i < 4; i++) {
            soma = 0;

            // Loop para percorrer as colunas
            for (int j = 0; j < 4; j++) {
                soma = soma + mat[i][j];
            }

            // Print da soma de cada linha
            System.out.printf("Soma da linha %d: %d\n", i, soma);

            // Armazenamento da soma
            vet[i] = soma;
        }
    }
}