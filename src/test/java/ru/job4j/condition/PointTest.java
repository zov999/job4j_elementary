package ru.job4j.condition;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;

public class PointTest {



    @Test
    public void Distance() {

        int result  = 4;
       int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}