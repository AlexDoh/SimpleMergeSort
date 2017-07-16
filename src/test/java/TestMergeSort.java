import com.odmytrenko.mergesort.MergeSort;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class TestMergeSort {

    @Test
    public void shouldReturnSortedArray() {
        int[] testArray = {9, 0, 10, 15, 20, -10, 440, 7, 1000, 1, 3, 4, 7, 5, 8, 6, 7, 8};
        int[] expectedArray = {9, 0, 10, 15, 20, -10, 440, 7, 1000, 1, 3, 4, 7, 5, 8, 6, 7, 8};

        Arrays.sort(expectedArray);
        MergeSort.sort(testArray);

        Assert.assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void shouldReturnEmptyArray() {
        int[] testArray = {};
        int[] expectedArray = {};

        MergeSort.sort(testArray);

        Assert.assertArrayEquals(expectedArray, testArray);
    }
}
