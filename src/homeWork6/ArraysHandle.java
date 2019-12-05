package homeWork6;

import java.util.Arrays;

public class ArraysHandle {


    public int[] getArrayFromLastFour(int[] arr1) throws ArrayHasNoFourException {

        int indexDig = -1;

        for (int i = arr1.length - 1; i > 0; i--) {
            if (arr1[i] == 4) {
                indexDig = ++i;
                break;
            }
        }
        if (indexDig == -1) {
            throw new ArrayHasNoFourException("array has no 4 ");
        }
        return Arrays.copyOfRange(arr1, indexDig, arr1.length);
    }

    public boolean checkArray(int[] arr) {
        boolean oneInArray = false;
        boolean fourInArray = false;
        for (int a : arr) {
            if (a!=1 && a!=4){
                return false;
            }

            if (a == 1) {
                oneInArray = true;
            }
            if (a == 4) {
                fourInArray = true;
            }

        }
        if (oneInArray && fourInArray) {
            return true;
        }else {
            return false;
        }

    }
}
