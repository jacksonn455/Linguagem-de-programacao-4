package javaapplication5;

import java.util.Random;

public class ThreadDebito implements Runnable {

    private Conta account;

    public ThreadDebito(Conta account) {
        this.setAccount(account);
    }

    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(3000);
                Random random = new Random();
                int randomdebit = random.nextInt(10001);
                System.out.println("GetAmount Debit: " + getAccount().getSaldo());
                getAccount().Debitvalue(Double.valueOf(randomdebit));
                System.out.println("Random Debit: " + randomdebit);
                System.out.println("Total value Debit: " + getAccount().getSaldo());
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
