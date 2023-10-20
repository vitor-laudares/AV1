package io.sim;

class FuelStation {
    private ContaCorrente conta;

    public FuelStation(double saldoInicial) {
        conta = new ContaCorrente(saldoInicial);
        conta.start(); // Inicia a thread da Conta Corrente
    }

    public ContaCorrente getContaCorrente() {
        return conta;
    }
}
