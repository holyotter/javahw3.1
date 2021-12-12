package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    int maxStation = 9;
    int minStation = 0;
    int maxVolume = 10;
    int minVolume = 0;

    public void shouldNextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
    }

    public void shouldPrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
    }

    public void shouldUpVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void shouldDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
