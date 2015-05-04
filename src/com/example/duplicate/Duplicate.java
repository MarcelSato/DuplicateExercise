package com.example.duplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by marcelsato on 5/2/15.
 */
public class Duplicate {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 51; i++){
            numbers.add(i);
        }
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);
        numbers.add(36);
        numbers.add(13);
        HashSet numbersSet = new HashSet();
        for(int i = 0; i < numbers.size(); i++){
            if(numbersSet.add(numbers.get(i))){

            } else {
                System.out.println(numbers.get(i) + " is a duplicate");
            }
        }
    }
}
