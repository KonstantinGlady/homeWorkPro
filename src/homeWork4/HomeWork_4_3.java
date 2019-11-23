package homeWork4;

public class HomeWork_4_3 {
    
 //TODO 3. Написать класс МФУ, на котором возможно одновременно выполнять печать и сканирование документов,
 // но нельзя одновременно печатать или сканировать два документа. При печати в консоль выводится сообщения
 // «Отпечатано 1, 2, 3,... страницы», при сканировании – аналогично «Отсканировано...». Вывод в консоль с периодом в 50 мс.

    private Object printLock = new Object();
    private Object scanLock = new Object();

    public static void main(String[] args) {

        HomeWork_4_3 work = new HomeWork_4_3();

        new Thread(() -> work.printDocument(1)).start();
        new Thread(() -> work.printDocument(2)).start();
        new Thread(() -> work.scanDocument(3)).start();
        new Thread(() -> work.scanDocument(4)).start();
    }

    private void scanDocument(int numberThread) {
        for (int i = 0; i <10 ; i++) {

            synchronized (scanLock){
                System.out.printf("Сканируем документ %s %s \n",numberThread,i);

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printDocument(int numberThread) {

        for (int i = 0; i < 10; i++) {
            synchronized (printLock) {
                System.out.printf("Печатаем документ %s %s \n", numberThread, i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
