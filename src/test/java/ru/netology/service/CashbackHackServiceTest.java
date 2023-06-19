package ru.netology.service;

import static org.testng.Assert.*;
public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemainIfAmountOne() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemainOverLimit() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void RemainIfAmountIsLimit() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemainAmountMax() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;
        int expected = 2;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemainAmountZero() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
}
