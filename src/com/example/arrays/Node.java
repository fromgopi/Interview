package com.example.arrays;

public class Node {

    private int x,y;
    private int dir;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;

        this.dir = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }
}
