package JavaApplication2;

import java.util.Random;

public class Producer implements Runnable {

    private static Random generator = new Random();
    private Buffer sharedLocation;

    // construtor
    public Producer(Buffer shared) {
        sharedLocation = shared;
    }

    @Override
    public void run() {
        for (int count = 1; count <= 5;) {
            try {
                Random random = new Random();
                int gerar = random.nextInt(101);
                System.out.println("Numero gerado: " + gerar);
                Boolean ehPrimo = isPrimo(gerar);

                if (ehPrimo) {
                    sharedLocation.set(gerar);
                    count++;
                    Thread.sleep(generator.nextInt(3000));
                }
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

        System.out.printf("\n%s\n%s\n", "Produtor terminou a produção de dados", "Fim do Produtor!\n");
    }

    public Boolean isPrimo(int primo) {
        boolean isPrimo = true;
        int divisor = 0;
        for (int i = 2; i <= primo; i++) {
            if (((primo % i) == 0) && (i != primo)) {
                isPrimo = false;
                divisor = i;
                break;
            }
        }
        if (isPrimo) {
            System.out.println("o número é primo");
        } else {
            System.out.println("o numero não é primo");
        }
        return isPrimo;
    }
}
