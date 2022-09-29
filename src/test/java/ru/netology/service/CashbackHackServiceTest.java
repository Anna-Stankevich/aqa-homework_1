package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();
    @Test
    public void shouldReturn100IfAmountIs900(){

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn1000IfAmountIs0(){

        int amount = 0;

        int expected = 1000;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual,expected);
    }
    @Test
    public void shouldReturn800IfAmountIs1200() {
        int amount = 1200;

        int expected = 800;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturn0IfAmountIs1000(){
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }
}