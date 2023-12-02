package io.sim;

class Tarefa extends Thread {
    private String taskName;
    private int priority;
    private Tarefa dependency;

    public Tarefa(String taskName, int priority, Tarefa dependency) {
        this.taskName = taskName;
        this.priority = priority;
        this.dependency = dependency;
    }

    @Override
    public void run() {
        if (dependency != null) {
            try {
                dependency.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Executando " + taskName);
    }
}
