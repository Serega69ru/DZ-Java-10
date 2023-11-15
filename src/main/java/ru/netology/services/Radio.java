package ru.netology.services;

public class Radio {
    private int CurrentStation;
    private int CurrentVolume;

    public int getCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > 9) {
            return;
        }
        this.CurrentStation = CurrentStation;
    }

    public void NextStation() {
        if (CurrentStation != 9) {
            CurrentStation = CurrentStation + 1;
        } else {
            CurrentStation = 0;
        }
    }

    public void PrevStation() {
        if (CurrentStation != 0) {
            CurrentStation = CurrentStation - 1;
        } else {
            CurrentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 100) {
            return;
        }
        this.CurrentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (CurrentVolume < 100) {
            CurrentVolume = CurrentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (CurrentVolume > 0) {
            CurrentVolume = CurrentVolume - 1;
        }
    }
}