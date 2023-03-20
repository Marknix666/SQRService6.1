package ru.netology.sqr;

public class SQRService {

    public int calcSQRcount(int lowLimit, int highLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int icount = i * i;
            if (icount >= lowLimit) {
                if (icount <= highLimit) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
