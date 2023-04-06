import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountingSortTest {
    @Test
    public void sortTest1() {
        int[] arr = {2, 3, 1, 5, 4};
        int[] expected = {1, 2, 3, 4, 5};
        CountingSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void sortTest2() {
        int[] arr = {7, 4, 5, 2, 1};
        int[] expected = {1, 2, 4, 5, 7};
        CountingSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void sortTest3() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        CountingSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void sortTest4() {
        int[] arr = {2, 3, 4, 1, 5};
        int[] expected = {1, 2, 3, 4, 5};
        CountingSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void sortTest5() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        CountingSort.sort(arr);
        assertArrayEquals(expected, arr);
    }
}