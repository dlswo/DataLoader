package com.company;

import java.util.Arrays;

public class LetterTest {

    public void alpaCount(String str){

        int[] arr = new int[26];


        char[] chArr = str.toCharArray();

        for(int i = 0; i < chArr.length; i++){
            int value = (int)chArr[i];
            if(value >=65 && value <=90) {
                System.out.println(value);
                arr[value - 65] = arr[value - 65] + 1;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
