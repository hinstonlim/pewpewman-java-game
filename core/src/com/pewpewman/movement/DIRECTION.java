package com.pewpewman.movement;

public enum DIRECTION {

    NORTH(0,1),
    EAST (1,0),
    SOUTH(0,-1),
    WEST (-1,0),
    ;

    private final int dx;
    private final int dy;

    DIRECTION(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }
    public int getDy() {
        return dy;
    }
}
