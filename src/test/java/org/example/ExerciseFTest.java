package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseFTest {

    @Test
    void searchCity() throws IOException {
        ExerciseF exerciseF = new ExerciseF();
        String word = "sisayang";
        int expected = 2;
        int actual = exerciseF.SearchCity(word).size();
        assertEquals(expected,actual);
    }
}
