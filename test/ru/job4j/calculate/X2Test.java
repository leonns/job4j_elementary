package ru.job4j.calculate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        int expected = 40;
        assertThat(X2.calc(10, 0, 0, 2), is(expected));
    }

    @Test
    public void whenABCXOne() {
        int expected = 3;
        assertThat(X2.calc(1, 1, 1, 1), is(expected));
    }

    @Test
    public void whenAZeroBCXOne() {
        int expected = 2;
        assertThat(X2.calc(0, 1, 1, 1), is(expected));
    }

    @Test
    public void whenABXOneCZero() {
        int expected = 2;
        assertThat(X2.calc(1, 1, 0, 1), is(expected));
    }

    @Test
    public void whenABCOneXZero() {
        int expected = 1;
        assertThat(X2.calc(1, 1, 1, 0), is(expected));
    }

}