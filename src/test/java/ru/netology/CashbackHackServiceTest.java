package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void remain1() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
}