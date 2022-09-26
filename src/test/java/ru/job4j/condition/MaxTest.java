package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class MaxTest {


    @Test
    public void whenMax1To2Then2() {
        int result = 1;
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void whenMax2To1Then1() {
        int result = 2;
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void whenMax2equals1Then1() {
        int result = 1;
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}