package com.forest.simulation.agents;

import com.forest.simulation.core.Board;
import java.util.Random;

public abstract class Agent {
    protected int x;
    protected int y;
    protected Board board; // Referencja do planszy, żeby agent wiedział, po czym chodzi
    protected Random random; // Generator losowości do ruchów

    // Konstruktor - tworząc agenta, od razu mówimy mu gdzie stoi i na jakiej planszy
    public Agent(int startX, int startY, Board board) {
        this.x = startX;
        this.y = startY;
        this.board = board;
        this.random = new Random();
    }

    // Każdy agent szuka celu po swojemu, więc zostawiamy to jako abstrakt
    public abstract void findTarget();

    // Gotowa metoda na losowy spacer
    public void moveRandomly() {
        int dx, dy;
        do {
            dx = random.nextInt(3) - 1;
            dy = random.nextInt(3) - 1;
        } while (dx == 0 && dy == 0);

        this.x = board.wrapCoordinate(this.x + dx, board.getWidth());
        this.y = board.wrapCoordinate(this.y + dy, board.getHeight());
    }

    public void moveToTarget() {
        // TODO: Zaimplementować ruch w kierunku konkretnego celu (wymaga znajomości celu)
    }

    public int getX() { return x; }
    public int getY() { return y; }
}