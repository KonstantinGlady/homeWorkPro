package homeWork6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ArraysHandleTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {


        return Arrays.asList(new Object[][]{
                {new int[]{5, 2, 1}, new int[]{1, 2, 2, 3, 2, 4, 5, 2, 1}},
                {new int[]{1, 2}, new int[]{2, 2, 3, 1, 4, 1, 2}},
                {new int[]{5, 3, 7}, new int[]{3, 1, 7, 4, 5, 3, 7}},
                {new int[]{1}, new int[]{3, 4, 1, 4, 1}},

        });

    }

    private int[] expected, input;

    public ArraysHandleTest(int[] expected, int[] input) {

        this.expected = expected;
        this.input = input;
    }

    private ArraysHandle arraysHandle;

    @Before
    public void init() {
        arraysHandle = new ArraysHandle();
    }

    @Test
    public void arrayTest() throws ArrayHasNoFourException {

        Assert.assertArrayEquals(expected, arraysHandle.getArrayFromLastFour(input));

    }
}