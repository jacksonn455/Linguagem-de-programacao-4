package javaapplication1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayWorker implements Runnable {

    private static final List<ArrayWorker> threadList = new LinkedList<>();
    private static final Random rnd = new Random(System.currentTimeMillis());

    private final int[] array;
    private final int index;

    public ArrayWorker(final int[] array, final int index) {
        if (index > array.length - 1) {
            throw new IndexOutOfBoundsException(String.format("%d", index - array.length));
        }

        this.array = array;
        this.index = index;
        //System.out.println(this + " criado");
    }

    @Override
    public void run() { 
        System.out.println(this);
        this.array[this.index] = rnd.nextInt(100);

        
        if (index < array.length - 2) {
            final ArrayWorker worker = new ArrayWorker(array, index + 1);

            //System.out.println(this + " esta criado: " + worker);
            new Thread(worker).start();

            threadList.add(this);
            try {
                synchronized (this) {
                   // System.out.println(this + " aguardando");
                    this.wait();
                  //  System.out.println(this + " notificado");
                }
            } catch (InterruptedException ex) {
              //  System.out.println("Erro ao esperar");
                threadList.remove(this);
            }
        } else {
            threadList.forEach(worker -> {
                synchronized (worker) {
                   // System.out.println(this + " notificando: " + worker);
                    worker.notify();
                }
            });
        }
    } 

    @Override
    public String toString() {
        return "Thread " + index + " executou";
    }

    public static void main(String[] args) {
        System.out.println("Iniciando as threads");
         System.out.println("");
        final int[] myArray = new int[101];

        Thread t = new Thread(new ArrayWorker(myArray, 0));
        try {
            t.start();
            t.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.exit(-1);
        }

    }
}
