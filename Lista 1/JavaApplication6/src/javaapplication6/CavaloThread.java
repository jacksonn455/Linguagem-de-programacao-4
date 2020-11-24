package javaapplication6;

public class CavaloThread implements Runnable {

    private String nome;
    private double velocidade;
    private double distPercorrido;
    private double distMax;

    public CavaloThread(String n, double ve, double pe, double dm) {
        nome = n;
        velocidade = ve;
        distPercorrido = pe;
        distMax = dm;
    }

    public void run() {
        while (distPercorrido < distMax) {
            distPercorrido += velocidade;
        }
        if(distPercorrido >- distMax){
            System.out.println(nome + " Chegou!");
            }
    }
}
