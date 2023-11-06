package ru.netology.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testAmountEqualThousand() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testAmountBelowThousand() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testAmountAboveThousand() {
        int amount = 1899;
        int actual = service.remain(amount);
        int expected = 101;
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testAmountMultipleThousand() {
        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        org.junit.Assert.assertEquals(expected, actual);
    }
}