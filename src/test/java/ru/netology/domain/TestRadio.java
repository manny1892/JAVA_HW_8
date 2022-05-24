package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestRadio {
    @Test
    void volumeChangeBeforeUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.increaseVolume();
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeAfterUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeBeforeLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeAfterLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeBeforeUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.nextStation();
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeAfterUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeBeforeLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.previousStation();
        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeAfterLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.previousStation();
        radio.previousStation();
        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberBeforeLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberBeforeUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterSet() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setCurrentStation(8);
        radio.setCurrentStation(2);

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterSetUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setCurrentStation(8);
        radio.setCurrentStation(2);
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterSetLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setCurrentStation(8);
        radio.setCurrentStation(2);
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }
}
