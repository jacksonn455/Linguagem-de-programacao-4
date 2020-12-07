package JavaApplication2;

// A classe Consumer representa a thread consumidora em um relacionamento
// Produtor/Consumidor
// O método run da classe Consumer itera dez vezes lendo um valor do buffer
import java.util.Random;

public class Consumer implements Runnable {

    private static Random generator = new Random();
    private Buffer sharedLocation; // referência a objeto compartilhado

    // construtor
    public Consumer(Buffer shared) {
        sharedLocation = shared;
    } // fim do construtor Producer

    // lê o valor de sharedLocation quatro vezes e soma os valores
    @Override
    public void run() {
        int sum = 0;

        for (int count = 1; count <= 5; count++) {
            Random gerador = new Random();
            int k = gerador.nextInt(10);
            
            //numeros primos
            if (k % count == 0) {
                try // dorme de 0 a 3 segundos, então lê valor no buffer
                {
                    // a thread dorme... espera sincronizada
                    Thread.sleep(1000);
                    sum += sharedLocation.get(); // adiciona valor lido à soma
                    //System.out.printf("\t\t\t\t%2d\n", sum); // imprime o somatório
                } // fim do try
                // se a thread adormecida é interrompida, imprime rastreamento de pilha
                catch (InterruptedException exception) {
                    exception.printStackTrace();
                } // fim do catch
            } // fim do for

            System.out.printf("\n%s %d.\n%s\n",
                    "A soma dos valores primos lidos pelo Consumidor foi ",
                    sum,
                    "Fim do Consumidor!\n");
        } // fim método run 
    }
} // fim da classe Consumer

