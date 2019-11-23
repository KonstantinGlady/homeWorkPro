package homeWork4;

public class Main {

//TODO Первое задание  Создать три потока, каждый из которых выводит определенную
// букву (A, B и C) 5 раз (порядок – ABСABСABС). Используйте wait/notify/notifyAll.

    private final Object obj = new Object();
    private volatile char currentChar = 'A';

    public static void main(String[] args) {

        Main myThread = new Main();
        Thread t1 = new Thread(myThread::typeLetterA);
        Thread t2 = new Thread(myThread::typeLetterB);
        Thread t3 = new Thread(myThread::typeLetterC);

        t1.start();
        t2.start();
        t3.start();
    }


    private void typeLetterA() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'A') {
                        obj.wait();
                    }
                    System.out.print("A");
                    currentChar = 'B';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void typeLetterB() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'B') {
                        obj.wait();
                    }
                    System.out.print("B");
                    currentChar = 'C';
                    obj.notifyAll();
                }

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    private void typeLetterC() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'C') {
                        obj.wait();
                    }
                    System.out.print("C");
                    currentChar = 'A';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
