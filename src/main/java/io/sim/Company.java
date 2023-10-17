package io.sim;

import java.util.ArrayList;
import java.util.List;

// Importe as bibliotecas necessárias para comunicação em rede, se necessário.

public class Company extends Thread {
    private ArrayList<Route> routesToExecute;
    private ArrayList<Route> routesInExecution;
    private ArrayList<Route> executedRoutes;

    // Adicione os atributos necessários para a comunicação com a classe Cars e AlphaBank.

    public Company() {
        // Inicialize os ArrayLists.
        routesToExecute = new ArrayList<>();
        routesInExecution = new ArrayList<>();
        executedRoutes = new ArrayList<>();

        // Inicialize a comunicação com a classe Cars e AlphaBank, se necessário.
    }

    public void run() {
        addRouteToExecute("341671964#3 341671964#4 341671964#5 341671964#6 341671964#7 341671964#8 341671964#9 341671964#10 341671964#11 341671964#12 794061367#0 794061367#1 794061367#2 794061367#3 794061367#4 794061367#5 794061352#0 794061352#1 795084570#0 795084570#1 795084570#2 795084570#3 795084570#4 795084570#5 795084569#0 795084569#1 795084569#2 795084569#3 15469789#0 15469789#1 15469789#2 15469789#3 15469789#4 15469789#5 15469789#6 15469789#7 795084568 392002072#0 392002072#1 392002072#2 14479140 -14479140","1");
    }

    public void addRouteToExecute(String edges, String id) {
        // Crie uma instância de Route a partir da string de bordas e adicione-a à lista de rotas a serem executadas.
        Route route = new Route(edges, id);
        routesToExecute.add(route);
    }


    public void moveRouteToExecution(Route route) {
        routesToExecute.remove(route); // Remove da lista de rotas a serem executadas
        routesInExecution.add(route);   // Adiciona à lista de rotas em execução
    }

    public void moveRouteToExecuted(Route route) {
        routesInExecution.remove(route);  // Remove da lista de rotas em execução
        executedRoutes.add(route);         // Adiciona à lista de rotas executadas
    }

    // Implemente os métodos de comunicação com Cars e AlphaBank, se necessário.

    // Outros métodos da classe Company...

    public static void main(String[] args) {
        // Exemplo de como iniciar a thread Company.
        Company company = new Company();
        company.start();
    }
}