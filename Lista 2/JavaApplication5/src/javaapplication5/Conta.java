package javaapplication5;

public class Conta {

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void Debitvalue(Double debitvalue) {
        if (debitvalue > getSaldo()) {
            System.out.println("Você não tem esse valor disponível");
            System.out.println("Seu valor disponível para saque é: " + getSaldo());
        } else {
            setSaldo(getSaldo() - debitvalue);
        }
    }

    public void Creditvalue(Double creditvalue) {
        setSaldo(getSaldo() + creditvalue);
    }
}
