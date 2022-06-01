package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentVolume;
    private int currentStation;

    private int defaultCountStation = 10;
    private int countStation = defaultCountStation - 1;

    private int minStation;

    private int maxVolume = 100;

    private int minVolume = 0;

    public Radio(int countStation) {
        this.countStation = countStation - 1;
    }

    public void setCountStation(int countStation) {
        this.countStation = countStation - 1;
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