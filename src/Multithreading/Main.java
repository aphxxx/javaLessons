package Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello World");
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

        Thread thread = new Thread(new Runnerr());
        thread.start();
        System.out.println("sadfgsdfgsdfgdsfg");
    }
}

class Runnerr implements Runnable{

    @Override
    public void run() {
      for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}

class MyThread extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}
