package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldCorrectAmount() {
        assertEquals(service.remain(2200), 800);

    }

    @org.junit.Test
    public void shouldAmountZ0() {
        assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void shouldAmountZ1() {
        assertEquals(service.remain(1), 999);
    }

    @org.junit.Test
    public void shouldBuyExtraIfTheAmount999() {
        assertEquals(service.remain(999), 1);
    }

    @org.junit.Test
    public void shouldBuyExtraIfTheAmount1000() {
        assertEquals(service.remain(1000), 0);
    }
}