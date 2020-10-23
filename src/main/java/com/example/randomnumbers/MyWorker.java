package com.example.randomnumbers;

public class MyWorker {
    public static int RandomNumber(int value){
        int min = 1;
        int max = 100;
        double anyNumber = Math.random() * (max - min + 1) + min;

        return (int) anyNumber;
    }
}
