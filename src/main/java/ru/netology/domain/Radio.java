package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentStation;

    private int defaultCountStation = 10;
    private int countStation = defaultCountStation - 1;

    private int minStation;

    private int maxVolume = 100;

    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int countStation) {
        this.countStation = countStation - 1;
    }

    public int getCountStation() {
        return countStation;
    }

    public void setCountStation(int countStation) {
        this.countStation = countStation - 1;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > countStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = minVolume;
        }
    }

    public void nextStation() {
        if (currentStation < countStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = minStation;
        }
    }

    public void previousStation() {
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = countStation;
        }
    }
}