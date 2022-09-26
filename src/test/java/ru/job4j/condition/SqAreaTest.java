package ru.job4j.condition;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SqAreaTest {

    @Test
    public void square() {
        int result = 2;
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}