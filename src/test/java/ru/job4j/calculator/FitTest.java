package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class FitTest {
    @Test
    public void manWeight() {
               double result = 100.05;
        double expected = 100.05;

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void womanWeight() {
            double result = 100.05;
           double expected = 100.05;

           assertThat(result).isEqualTo(expected);
    }
}