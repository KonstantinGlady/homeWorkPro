package homeWork5;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainClass {

    public static final int CARS_COUNT = 4;
    final static CountDownLatch latch = new CountDownLatch(CARS_COUNT);
    final static Semaphore semaphore = new Semaphore(CARS_COUNT/2);


    public static void main(String[] args) {

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        Race race = new Race(new Road(60), new Tunnel(semaphore), new Road(40));
        Car[] cars = new Car[CARS_COUNT];


        ExecutorService service = Executors.newFixedThreadPool(CARS_COUNT);
        List<Callable<String>> list = new ArrayList<>();

        for (int i = 0; i < cars.length; i++) {
            list.add(new Car(race, 20 + (int) (Math.random() * 10), latch));
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");


        try {
            List<Future<String>> futures = service.invokeAll(list);

            for (Future<String> f : futures) {
             //  System.out.println(f.get());
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
                break;
            }
        } catch (InterruptedException  e) {
            e.printStackTrace();
        }



    }

}