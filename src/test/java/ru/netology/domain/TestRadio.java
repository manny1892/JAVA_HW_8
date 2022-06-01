package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestRadio {
    Radio radio = new Radio(30);


    @Test
    void volumeChangeBeforeUpperLimit() {

        radio.setCurrentVolume(98);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeUpperLimit() {

        radio.setCurrentVolume(98);
        radio.increaseVolume();
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = radio.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeAfterUpperLimit() {

        radio.setCurrentVolume(98);
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = radio.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeBeforeLowerLimit() {

        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeLowerLimit() {

        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = radio.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeChangeAfterLowerLimit() {

        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = radio.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeBeforeUpperLimit() {

        radio.setCurrentStation(27);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 28;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeUpperLimit() {

        radio.setCurrentStation(27);
        radio.nextStation();
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 29;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeAfterUpperLimit() {

        radio.setCurrentStation(27);
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeBeforeLowerLimit() {

        radio.setCurrentStation(2);
        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeLowerLimit() {

        radio.setCurrentStation(2);
        radio.previousStation();
        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void stationChangeAfterLowerLimit() {

        radio.setCurrentStation(2);
        radio.previousStation();
        radio.previousStation();
        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 29;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberBeforeLowerLimit() {

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberLowerLimit() {

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterLowerLimit() {

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberBeforeUpperLimit() {

        radio.setCurrentStation(28);

        int actual = radio.getCurrentStation();
        int expected = 28;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberUpperLimit() {

        radio.setCurrentStation(29);

        int actual = radio.getCurrentStation();
        int expected = 29;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterUpperLimit() {

        radio.setCurrentStation(30);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterSet() {

        radio.setCurrentStation(9);
        radio.setCurrentStation(8);
        radio.setCurrentStation(2);

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterSetUpperLimit() {

        radio.setCurrentStation(9);
        radio.setCurrentStation(8);
        radio.setCurrentStation(2);
        radio.setCurrentStation(30);

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void setStationNumberAfterSetLowerLimit() {

        radio.setCurrentStation(9);
        radio.setCurrentStation(8);
        radio.setCurrentStation(2);
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void defaultStationChangeBeforeUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void defaultStationChangeUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.nextStation();
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void defaultStationChangeAfterUpperLimit() {
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
    void defaultStationChangeBeforeLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void defaultStationChangeLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.previousStation();
        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void defaultStationChangeAfterLowerLimit() {
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
    void defaultSetStationNumberBeforeLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void defaultSetStationNumberLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void defaultSetStationNumberAfterLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void defaultSetStationNumberBeforeUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void defaultSetStationNumberUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void defaultSetStationNumberAfterUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void defaultSetStationNumberAfterSet() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setCurrentStation(8);
        radio.setCurrentStation(2);

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void defaultSetNumberAfterSetUpperLimit() {
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
    void defaultSetStationNumberAfterSetLowerLimit() {
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
