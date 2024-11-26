package telran.multithreading;

public class Main {
    static Object obj1 = new Object();
    static Object obj2 = new Object();
    
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (obj1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized (obj2) {
                
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (obj2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized (obj1) {
                
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}