package io.sim;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

class Simulation {
    private static final int NUM_SIMULATIONS = 100;
    private List<DataPoint[]> simulationResults;

    public Simulation() {
        simulationResults = new ArrayList<>();
    }

    public void runSimulations(Route route) {
        for (int i = 0; i < NUM_SIMULATIONS; i++) {
            DataPoint[] dataPoints = simulateRoute(route);
            simulationResults.add(dataPoints);
        }
    }

    private DataPoint[] simulateRoute(Route route) {
        
        String numPoints1 = route.getId();
        Integer numPoints = Integer.valueOf(numPoints1);
        DataPoint[] dataPoints = new DataPoint[numPoints];
        Random random = new Random();

        for (int i = 0; i < numPoints; i++) {
            double simulatedSpeed = random.nextDouble() * 100; // Simulação de velocidade
            dataPoints[i] = new DataPoint(simulatedSpeed);
        }

        return dataPoints;
    }

    public void analyzeData() {
        for (DataPoint[] dataPoints : simulationResults) {
            DescriptiveStatistics stats = new DescriptiveStatistics();
            for (DataPoint dataPoint : dataPoints) {
                stats.addValue(dataPoint.getSpeed());
            }

            System.out.println("Média: " + stats.getMean());
            System.out.println("Desvio Padrão: " + stats.getStandardDeviation());
        }
    }
}
