package io.sim;

class Driver {
    private ContaCorrente conta;
    private FuelStation fuelStation;

    public Driver(double saldoInicial, FuelStation fuelStation) {
        conta = new ContaCorrente(saldoInicial);
        this.fuelStation = fuelStation;
        conta.start(); // Inicia a thread da Conta Corrente
    }

    public void receberPagamento(double valor) {
        Transacao transacao = new Transacao(valor, conta, this.fuelStation.getContaCorrente());
        transacao.executar();
    }

    public void pagarFuelStation(double valor) {
        Transacao transacao = new Transacao(valor, conta, this.fuelStation.getContaCorrente());
        transacao.executar();
    }

    public ContaCorrente getContaCorrente() {
        return conta;
    }
}
