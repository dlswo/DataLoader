package com.company;

public class Main {

    public static void main(String[] args) {
        DataLoader scanEx = new DataLoader();
        String str = scanEx.loadData("C:\\zzz\\노인과바다.txt");
        LetterTest lt = new LetterTest();
        lt.alpaCount(str);
    }
}
