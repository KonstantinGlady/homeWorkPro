package homeWork1.Fruits;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    private static Apple apple;
    private static Orange orange;

    public static void main(String[] args) {
        //TODO 3
        // а.Даны классы Fruit -> Apple, Orange;
        // б. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        // с. Для хранения фруктов внутри коробки можно использовать ArrayList;
        // d. Сделать метод getWeight(), который высчитывает вес коробки. Задать вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        // e. Внутри класса Box сделать метод Compare, который позволяет сравнить текущую коробку с той, которую подадут в Compare в качестве параметра. True – если их массы равны, False в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
        // f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        // g. Не забываем про метод добавления фрукта в коробку.

        Box<Fruits> fruitBox1 = new Box<>("fruitBox1");
        apple = new Apple();

        for (int i = 0; i < 5; i++) {
            fruitBox1.putInBox(apple);
        }
        double weightAppleBox = fruitBox1.getWeight();

        System.out.println("apples in the box: " + weightAppleBox);

        Box<Fruits> fruitBox2 = new Box<>("fruitBox2");
        orange = new Orange();
        for (int i = 0; i < 7; i++) {
            fruitBox2.putInBox(orange);
        }

        double weightOrangeBox = fruitBox2.getWeight();
        System.out.println("oranges in the box: " + weightOrangeBox);

        boolean compareBoxes = fruitBox1.compare(fruitBox2);
        System.out.println("boxes have the same weight: "+ compareBoxes);

        System.out.println("");
        fruitBox1.printArray();
        fruitBox2.printArray();

        fruitBox1.moveFruitsTo(fruitBox2);

        fruitBox1.printArray();
        fruitBox2.printArray();


    }


}
