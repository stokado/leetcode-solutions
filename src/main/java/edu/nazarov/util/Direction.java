package edu.nazarov.util;

public enum Direction {
    UP(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0),
    DOWN(0, 1);

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public final int dx;
    public final int dy;
}
