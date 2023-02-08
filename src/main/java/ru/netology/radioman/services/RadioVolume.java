package ru.netology.radioman.services;

public class RadioVolume {
    public int currentRadioVolume;

    public int getCurrentRadioVolume() {

        return currentRadioVolume;
    }

    public void maxRadioVolume(int newMaxRadioVolume) {

        if (newMaxRadioVolume == 10) {

            currentRadioVolume = newMaxRadioVolume + 1;
            currentRadioVolume = 10;
        }

        if ((newMaxRadioVolume < 10) & (newMaxRadioVolume > 0)) {

            currentRadioVolume = newMaxRadioVolume + 1;
        }
    }

    public void minRadioVolume(int newMinRadioVolume) {

        if (newMinRadioVolume == 0) {
            currentRadioVolume = newMinRadioVolume - 1;
            currentRadioVolume = 0;
        }

        if ((newMinRadioVolume > 0) & (newMinRadioVolume < 10)) {
            currentRadioVolume = newMinRadioVolume - 1;
        }
    }
}


