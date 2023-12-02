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
            Tarefa t4 = new Tarefa("T4", 3, t3);
            Tarefa t5 = new Tarefa("T5", 3, t4);
            Tarefa t6 = new Tarefa("T6", 3, t5);
            Tarefa t7 = new Tarefa("T7", 3, t6);
            Tarefa t8 = new Tarefa("T8", 3, t7);
            Tarefa t9 = new Tarefa("T9", 3, t8);
            Tarefa t10 = new Tarefa("T10", 3, t9);
            
    
            Thread thread1 = new Thread(t1);
            Thread thread2 = new Thread(t2);
            Thread thread3 = new Thread(t3);
            Thread thread4 = new Thread(t4);
            Thread thread5 = new Thread(t5);
            Thread thread6 = new Thread(t6);
            Thread thread7 = new Thread(t7);
            Thread thread8 = new Thread(t8);
            Thread thread9 = new Thread(t9);
            Thread thread10 = new Thread(t10);
    
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
