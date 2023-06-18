package ru.netology.service;
import org.junit.Assert;
public class CashBackHackerServiceTest {
    @org.junit.Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);

    }

    @org.junit.Test
    public void testRemainIfAmountOne() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);

    }
    @org.junit.Test
    public void testRemainAmountZero() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);

    }
}