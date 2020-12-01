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
public class CMensagem extends Thread {

    private int ID;

    public CMensagem(int _ID) {
        this.ID = _ID;
    }

    @Override
    public void run() {
        System.out.printf("\n A thread %d foi sorteada", this.ID);
    }
}
