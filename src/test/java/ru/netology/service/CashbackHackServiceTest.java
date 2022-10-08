package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();
    @Test
    void shouldReturn100IfAmountIs900(){

        int amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn1000IfAmountIs0(){

        int amount = 0;

        int expected = 1000;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    void shouldReturn800IfAmountIs1200(){
        int amount = 1200;

        int expected = 800;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual,expected);

    }
    
    @Test
    void shouldReturn0IfAmountIs1000(){
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }
}
