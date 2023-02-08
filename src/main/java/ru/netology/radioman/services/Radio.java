package ru.netology.radioman.services;

public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void Next(int newCurrentRadioStation) {

        if (newCurrentRadioStation == 9) {

            currentRadioStation = 0;
        }

        if ((newCurrentRadioStation < 9) & (newCurrentRadioStation > 0)) {

            currentRadioStation = newCurrentRadioStation + 1;
        }
    }

    public void Prev(int newCurrentRadioStation) {

        if (newCurrentRadioStation == 0) {
            currentRadioStation = 9;
        }
        if ((newCurrentRadioStation > 0) & (newCurrentRadioStation < 9)) {


            currentRadioStation = newCurrentRadioStation - 1;
        }


    }

}




