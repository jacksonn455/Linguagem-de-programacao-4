package javaapplication5;

public class CincoThread implements Runnable {

    private int min;
    private int max;

    public CincoThread(int x, int y) {
        min = x;
        max = y;
    }

    CincoThread(int gerargerar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean cinco(int x) {

            if (x % 5 != 0) {
                return false;
            }
        return true;
    }

    public void run() {
        //System.out.println("Primos entre: "+min+"-"+max);
        for (int i = min; i <= max; i++) {
            if (cinco(i)) {
                System.out.println(i);
            }
        }
        System.out.println("");
    }
}
