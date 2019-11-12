package homeWork1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtils <E> {
    private  E [] arr;


    public ArrayUtils(E... arr) {
        this.arr = arr;
    }
    public E [] swapElements(int first, int second){
        E tempVar;
        tempVar = arr[first];
        arr[first] = arr[second];
        arr[second] = tempVar;
        return arr ;
    }

    public E[] getArr() {
        return arr;
    }

    public  ArrayList<E> arrayToArrayList( ){
        ArrayList<E> arrayList = new ArrayList<>(Arrays.asList(arr));
        return arrayList;
    }
}
