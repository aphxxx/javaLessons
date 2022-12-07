package Multithreading;

import java.util.Scanner;

public class MethodsWaitAndNotify {
    public static void main(String[] args) {
        ProducerConsumer wn = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class WaitAndNotify {
    private Object lock = new Object();
    public void produce() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Producer thread started...");
            lock.wait(); // for wait() need give the intrinsic lock and wait while notify() will be called
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner sc = new Scanner(System.in);

        synchronized (this){
            System.out.println("Waiting for return key pressed");
            sc.nextLine();
            notify();
        }
    }
}