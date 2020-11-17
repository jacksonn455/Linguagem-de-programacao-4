/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Avell
 */
public class T1 extends Thread{
    private int tThreadID;
    
    public T1(int _tThreadID)
    {
        this.tThreadID  = _tThreadID;
    }
    
    @Override
    public void run(){
        while(true){
            System.out.printf("\n Thread %d executando ... ", this.tThreadID);
        }
    }
}
