/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Avell
 */
public class ThreadSoma extends Thread {
    
    private int matriz[][];
    private int linha;
    private int dimensao;
    private int soma;
    
    public ThreadSoma(int _linha, int _dimensao, int _matriz[][]){
        this.linha = _linha;
        this.matriz = _matriz;
        this.dimensao = _dimensao;
        this.soma = 0;
    }

    ThreadSoma(int dimensao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void run(){
        for (int i = 0; i< dimensao; i++){
            this.soma += this.matriz[this.linha][i];
        }
        try {
            Thread.sleep(linha * 1000 + 1000);
            
            for(int i =0; i < dimensao; i++){
                System.out.printf("%d ", this.matriz[this.linha][i]);
            }
            System.out.printf(" Soma: %d \n", this.soma);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
