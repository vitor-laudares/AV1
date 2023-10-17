package io.sim;
import java.util.List;

public class Route {
    private String id; // ID da rota
    private String edges; // Lista de arestas que compõem a rota
    private double departureTime; // Tempo de partida da rota

    // Construtor
    public Route(String edges, String id ) {
        this.id = id;
        this.edges = edges;
    }

    // Getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEdges() {
        return edges;
    }

    public void setEdges(String edges) {
        this.edges = edges;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    // Outros métodos, se necessário
}