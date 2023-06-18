package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void testRemainIfAmountOne() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
    @Test
    public void testRemainAmountZero() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
}
