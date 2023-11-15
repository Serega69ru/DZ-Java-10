package ru.netology.services;

public class Radio {
    private int MinStation=0;
    private int MaxStation=9;
    private int CurrentStation=MinStation;
    private int CurrentVolume;
    public Radio(){
        this.MinStation=MinStation;
        this.MaxStation=MaxStation;
        this.CurrentStation=MinStation;
    }
    public Radio(int size){
        this.MaxStation=size-1;
    }
    public int getMinStation() {
        return MinStation;
    }
    public int getMaxStation() {
        return MaxStation;
    }

    public int getCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < MinStation) {
            return;
        }
        if (CurrentStation > MaxStation) {
            return;
        }
        this.CurrentStation = CurrentStation;
    }

    public void NextStation() {
        if (CurrentStation != MaxStation) {
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