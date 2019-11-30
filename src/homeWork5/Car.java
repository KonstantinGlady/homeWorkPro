package homeWork5;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

public class Car implements Callable<String> {
    private static int CARS_COUNT;


    static {
        CARS_COUNT = 0;
    }

    private Race race;
    private int speed;
    private String name;
    private CountDownLatch latch;
    private CountDownLatch latch2;
    private Lock lock;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CountDownLatch latch) {
        this.race = race;
        this.speed = speed;
        this.latch = latch;
        this.latch2 = latch;

        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public String call() throws Exception {
        try {

            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            latch.countDown();
            latch.await();

            System.out.println(this.name + " готов");
            latch2.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
        latch2.await();
        
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        return this.name + " DONE";
    }
}