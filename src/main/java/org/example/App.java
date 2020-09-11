package org.example;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException {
        int[] a = {-4,-3,-2,-1};
        Solution testD = new Solution();
        System.out.println(testD.solution(a));

        Mask mask = new Mask();
        System.out.println(mask.mask("Annisa Tr Marliandini"));

        ExerciseF exerciseF = new ExerciseF();
        List<String> cities = exerciseF.SearchCity("sisayang");
        for (String city : cities){
            System.out.println(city);
        }
    }
}
