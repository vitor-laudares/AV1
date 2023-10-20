package io.sim;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Classe que representa uma transação financeira
class Transacao {
    private double valor;
    private ContaCorrente origem;
    private ContaCorrente destino;

    public Transacao(double valor, ContaCorrente origem, ContaCorrente destino) {
        this.valor = valor;
        this.origem = origem;
        this.destino = destino;
    }

    public void executar() {
        origem.sacar(valor);
        destino.depositar(valor);
    }
}

