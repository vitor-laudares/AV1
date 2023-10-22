package io.sim;

public class ContaCorrente extends Thread {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double valor) {
        saldo += valor;
    }

    public synchronized void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public synchronized double getSaldo() {
        return saldo;
    }

    @Override
    public void run() {
        
    }

    public void setSaldo(double d) {
    }
}