package org.example;

import jdk.nashorn.internal.runtime.Source;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionReturnShouldEqualToResult() {
        Solution s = new Solution();
        Map<int[], Integer> tests = new HashMap<int[], Integer>();
        tests.put(new int[] { 3, 2, -5, 0 }, -1);
        tests.put(new int[] { 10, -1, -2, -3 }, -4);
        tests.put(new int[] { 100, 200, 300, -100, -200, -3, -1, -2, -4, 1000, -5 }, -6);
        tests.put(new int[] { 0, 2, 4, -1, -3, -4 }, -2);
        tests.put(new int[] { 3, 2, -5, -1, -2, 0 }, -3);

        tests.forEach((problem,solution) -> assertEquals(s.solution(problem), solution));
    }
}
