package io.sim;

import io.Car;

public class FuelStation {
    private ContaCorrente conta;

    public FuelStation(double saldoInicial) {
        conta = new ContaCorrente(saldoInicial);
        conta.start(); // Inicia a thread da Conta Corrente
    }

    public ContaCorrente getContaCorrente() {
        return conta;
    }

    public void abastecer(Car car) {
        
    }
}
