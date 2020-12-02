package javaapplication4;

public class DezThread implements Runnable {

    private int min;
    private int max;

    public DezThread(int x, int y) {
        min = x;
        max = y;
    }


    public void run() {

        for (int i = max; i >= min; i--) {
            
            System.out.println(i);
        }
    }
}
