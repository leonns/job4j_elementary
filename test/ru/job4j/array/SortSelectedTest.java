package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThree() {
        int[] input = new int[] {7, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 5, 7};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortFive() {
        int[] input = new int[] {6, 7, 2, 3, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 3, 4, 6, 7};
        assertThat(result, is(expect));
    }
}