package homeWork4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork_4_2 {
    //TODO 2. Написать небольшой метод, в котором 3 потока построчно пишут данные в файл (по 10 записей с периодом в 20 мс).
    static BufferedWriter writer;

    public static void main(String[] args) {

        try {
            writer = new BufferedWriter(new FileWriter(new File("testFile.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }


        new Thread(() -> method(1)).start();
        new Thread(() -> method(2)).start();
        new Thread(() -> method(3)).start();


    }

    public  static void method(int threadLine) {

        try {

                 for (int i = 0; i < 10; i++) {
                writer.append(String.format("строка для вывода в файл %s  %s \n", i, threadLine));
                     writer.flush();

                     Thread.sleep(20);
             }


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }
}
