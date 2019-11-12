package homeWork1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        //TODO 1 Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

        String[] arr = {"A", "B", "C", "D"};

        System.out.println(Arrays.asList(arr));

        ArrayUtils<String> arrayUtils = new ArrayUtils<>(arr);

        String[] arr2;

        arr2 = arrayUtils.swapElements(1, 2);
        System.out.println(Arrays.asList(arr2));

        System.out.println("");
        ArrayUtils<Integer> arrayUtils2 = new ArrayUtils<>(1,3,4,6);
        System.out.println(Arrays.asList(arrayUtils2.getArr()));
        System.out.println(Arrays.asList(arrayUtils2.swapElements(2,3)));
        System.out.println("");

        // TODO 2 Написать метод, который преобразует массив в ArrayList;
        String [] arr3 = {"A","B","C","D"};
      ArrayList<String> arrayList2 = new   ArrayUtils<>(arr3).arrayToArrayList();
        System.out.println("С обобщением "+arrayList2);

        ArrayList <String> arrayList =     arrayListFromArray(arr3);
        System.out.println("Без обобщения "+arrayList);


    }

    private static ArrayList<String> arrayListFromArray(String[] arr3) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr3));
        return arrayList;
    }

}
