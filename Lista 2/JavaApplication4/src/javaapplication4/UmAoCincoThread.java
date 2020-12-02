package javaapplication4;

public class UmAoCincoThread implements Runnable {

    private int min;
    private int max;

    public UmAoCincoThread(int x, int y) {
        min = x;
        max = y;
    }

    public void run() {

        for (int i = min; i <= max; i++) {

            System.out.println(i);

        }
        System.out.println("");
    }
}
