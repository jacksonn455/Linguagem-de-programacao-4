package JavaApplication2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Consumer implements Runnable {

    private static Random generator = new Random();
    private Buffer sharedLocation;

    public Consumer(Buffer shared) {
        sharedLocation = shared;
    }

    @Override
    public void run() {
        int sum = 0;
        int primo = 0;
        ArrayList<Integer> primos = new ArrayList<Integer>(5);

        for (int count = 1; count <= 5; count++) {
            try {
                primo = sharedLocation.get();
                sum += primo;
                primos.add(primo);
                Collections.sort(primos);
                for (Integer prim : primos) {
                    System.out.println("Primo: " + prim);
                }
                System.out.println("Somatório dos valores primos: " + sum);
                Thread.sleep(generator.nextInt(3000));
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

        System.out.printf("\n%s %d.\n%s\n", "A soma dos valores lidos pelo Consumidor foi ", sum,
                "Fim do Consumidor!\n");
    }
}
