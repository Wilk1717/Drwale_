package com.las.symulacja.core;

public class Cell {
    private int x;
    private int y;
    private String state;
    private int regrowthCountdown;

    public void chopDown() {
        // Zmiana stanu na pusty
    }

    public boolean hasAdultTreeNeighbor() {
        return false;
    }

    public void grow() {
        // Odliczanie czasu do odrośnięcia drzewa
    }
}

