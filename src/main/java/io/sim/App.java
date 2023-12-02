package io.sim;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        EnvSimulator ev = new EnvSimulator();
        ev.start();
            Tarefa t1 = new Tarefa("T1", 1, null);
            Tarefa t2 = new Tarefa("T2", 2, t1);
            Tarefa t3 = new Tarefa("T3", 3, t2);
            // ... adicione mais tarefas conforme necessário
    
            Thread thread1 = new Thread(t1);
            Thread thread2 = new Thread(t2);
            Thread thread3 = new Thread(t3);
            Thread thread4 = new Thread(t1);
            Thread thread5 = new Thread(t2);
            Thread thread6 = new Thread(t3);
            Thread thread7 = new Thread(t1);
            Thread thread8 = new Thread(t2);
            Thread thread9 = new Thread(t3);
            Thread thread10 = new Thread(t3);
    
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread6.start();
            thread7.start();
            thread8.start();
            thread9.start();
            thread10.start();
            

    }
}
