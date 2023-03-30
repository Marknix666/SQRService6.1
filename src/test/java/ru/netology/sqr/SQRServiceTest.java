package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void calcWhenFewSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calcSQRcount(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void calcWhenFewSquaresNotFound() {
        SQRService service = new SQRService();

        int actual = service.calcSQRcount(100, 500);
        int expected = 13;

        assertEquals(expected, actual);
    }

    @Test
    public void calcWhenFewSquaresNotFounded() {
        SQRService service = new SQRService();

        int actual = service.calcSQRcount(100, 1000);
        int expected = 22;

        assertEquals(expected, actual);
    }
}

