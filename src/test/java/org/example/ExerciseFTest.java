package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseFTest {

    @Test
    void searchCity() throws IOException {
        Map<String,Integer> hashMap = new HashMap<>();
        ExerciseF exerciseF = new ExerciseF();
        hashMap.put("sisayang",10);
        hashMap.put("pulxu pqnjzng",1);
        hashMap.put("zogjakarta",4);

        hashMap.forEach((keyword,count) -> {
            try {
                assertEquals(exerciseF.SearchCity(keyword).size(),count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
