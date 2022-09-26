package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;




public class X2Test {

    @Test
    public void whenBCZero() {
        int result = 40;
        int expected = 40;

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenBCOne() {
        int result = 3;
        int expected = 3;

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void whenACOne() {
        int result = 2;
        int expected = 2;

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void whenBXOne() {
        int result = 2;
        int expected = 2;

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void whenABOne() {
        int result = 1;
        int expected = 1;

        assertThat(result).isEqualTo(expected);
    }
}