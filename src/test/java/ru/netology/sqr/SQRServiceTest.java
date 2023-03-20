package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    public void calcWhenFewSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calcSQRcount(lowLimit; 200, highLimit;300);
        int expeted = 3;

        assertEquals(expeted, actual);
    }
}