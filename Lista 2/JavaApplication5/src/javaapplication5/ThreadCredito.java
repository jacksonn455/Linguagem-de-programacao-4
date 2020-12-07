package javaapplication5;

import java.util.Random;

public class ThreadCredito implements Runnable {

    private Conta account;

    public ThreadCredito(Conta account) {
        this.setAccount(account);
    }

    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(3000);
                Random random = new Random();
                int randomcredit = random.nextInt(10001);
                System.out.println("GetAmount Credit: " + getAccount().getSaldo());
                getAccount().Creditvalue(Double.valueOf(randomcredit));
                System.out.println("Random Credito: " + randomcredit);
                System.out.println("Total value Credit: " + getAccount().getSaldo());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public Conta getAccount() {
        return account;
    }

    public void setAccount(Conta account) {
        this.account = account;
    }

}
