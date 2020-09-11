package org.example;

public class Solution {
    public int solution(int[] a) {

        int result = -1;
        int i = 0;

        while (true){
            if (a[i] == result){
                result--;
                i = -1;
            }
            if (i == a.length-1){
                break;
            }
            i++;
        }
        return result;
    }
}
