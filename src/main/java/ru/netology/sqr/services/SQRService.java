package ru.netology.sqr.services;

public class SQRService {
    public int calcSquares(int min, int max) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= min && i * i <= max) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}