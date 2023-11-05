package ru.netology.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void testAmountEqualThousand() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
       org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testAmountBelowThousand() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testAmountAboveThousand() {
        int amount = 1899;
        int actual = service.remain(amount);
        int expected = 101;
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testAmountMultipleThousand() {
        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        org.testng.Assert.assertEquals(actual, expected);
    }
}