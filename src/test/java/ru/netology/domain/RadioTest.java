package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void nextStationInRange() {
        radio.setCurrentStation(5);
        radio.shouldNextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void nextStationOutRange() {
        radio.setCurrentStation(9);
        radio.shouldNextStation();
        assertEquals(9, radio.getCurrentStation());
    }
}