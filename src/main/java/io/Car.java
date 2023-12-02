package io;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import io.sim.Driver;
import io.sim.FuelStation;



public class Car implements Runnable {
    private double fuelTank; // Tanque de combustível em litros
    private Driver driver;
    private FuelStation fuelStation;
    private boolean abastecendo; // Indica se o carro está sendo abastecido

    public Car(String modelo, Driver driver, FuelStation fuelStation) {
        this.fuelTank = 10.0; // Tanque de combustível inicial
        this.driver = driver;
        this.fuelStation = fuelStation;
        this.abastecendo = false;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void run() {
       
        while (true) {
            if (!abastecendo) {
                double distanciaPercorrida = 10.0; 
                double consumo = 0.1; // Exemplo de consumo de 0.1 litros por quilômetro
                double combustivelConsumido = distanciaPercorrida * consumo;
                fuelTank -= combustivelConsumido;

                if (fuelTank <= 3.0) {
                    abastecer();
                }
            } else {
                try {
                    // Carro está sendo abastecido, aguarda 2 minutos
                    Thread.sleep(120000); // 2 minutos em milissegundos
                    fuelStation.abastecer(this);
                    abastecendo = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            
        }
    }

    public void abastecer() {
        
        double saldoDriver = driver.getContaCorrente().getSaldo();
        if (saldoDriver >= 5.87) { // Valor de abastecimento por litro
            driver.getContaCorrente().sacar(5.87);
            fuelStation.abastecer(this);
            abastecendo = true;
        }
    }

    
}
