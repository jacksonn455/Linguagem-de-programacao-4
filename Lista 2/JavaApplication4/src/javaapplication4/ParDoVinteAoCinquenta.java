package javaapplication4;

public class ParDoVinteAoCinquenta implements Runnable {

    private int min;
    private int max;

    public ParDoVinteAoCinquenta(int x, int y) {
        min = x;
        max = y;
    }

    public boolean par(int x) {

            if (x % 2 != 0) {
                return false;
            }
        return true;
    }

    public void run() {

        for (int i = min; i <= max; i++) {
            if (par(i)) {
                System.out.println(i);
            }
        }
        System.out.println("");
    }
}
