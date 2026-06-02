package com.forest.simulation.core;

import com.forest.simulation.core.Cell;

import java.util.List;

public class Board {
    private int width;
    private int height;
    private Cell[][] grid;

    public Cell getCell(int x, int y) {
        return null;
    }

    public List<Cell> getNeighbors(int x, int y, int radius) {
        return null;
    }

    public int wrapCoordinate(int value, int max) {
        return 0; // Tu zrobimy matematykę dla zawijania krawędzi planszy (torus)
    }
}