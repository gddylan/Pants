package com.example.dylan.pantheons.model;

/**
 * Created by Dylan on 1/19/2018.
 */

public class Point {
    public int x;
    public int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other)
    {
        Point o = (Point) other;
        return o.x == x && o.y == y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
