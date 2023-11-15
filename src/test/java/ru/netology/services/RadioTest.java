package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testRadio() {
        Radio radio = new Radio(50);
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(49, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void TestSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentStationIfStationMore9() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(15);
        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentStationIfStationLess0() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(-6);
        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStationIfStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestPrevStationIfStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
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
    public void TestSetCurrentVolumeIfVolumeLess0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(90);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 90;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestIncreaseVolumeIfVolume100() {
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
        radio.setCurrentVolume(47);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 46;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestDecreaseVolumeIfVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
