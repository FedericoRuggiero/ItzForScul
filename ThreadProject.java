package threadproject;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

public class ThreadProject {

    public static void main(String[] args) {
        Mythread myThread = new Mythread();
        myThread.start();
        Mythread m = new Mythread();
        m.start();
    }

}

class Mythread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getId() + "Value: " + i);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Mythread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
