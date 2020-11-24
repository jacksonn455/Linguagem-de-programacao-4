package javaapplication5;

public class ImparThread implements Runnable {

    private int min;
    private int max;

    public ImparThread(int x, int y) {
        min = x;
        max = y;
    }

    ImparThread(int gerargerar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean impar(int x) {

            if (x % 2 == 0) {
                return false;
            }
        return true;
    }

    public void run() {
        //System.out.println("Primos entre: "+min+"-"+max);
        for (int i = min; i <= max; i++) {
            if (impar(i)) {
                System.out.println(i);
            }
        }
        System.out.println("");
    }
}
