package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void TestSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void TestSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.NextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.PrevStation();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }
}