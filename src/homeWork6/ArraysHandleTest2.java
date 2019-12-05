package homeWork6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArraysHandleTest2 {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, new int[]{1, 4, 4, 1, 4, 1}},
                {false, new int[]{1, 4, 3, 4, 1, 4, 1}},
                {true, new int[]{1, 4, 1, 4, 1}},
                {false, new int[]{1, 1, 1, 1, 1}},
        });
    }

    private int[] input;
    private boolean expected;

    public ArraysHandleTest2(boolean expected, int[] input) {
        this.input = input;
        this.expected = expected;
    }

    ArraysHandle handle;

    @Before
    public void init() {
        handle = new ArraysHandle();
    }

    @Test
    public void arrayTest() {
        Assert.assertEquals(expected, handle.checkArray(input));
    }
}
