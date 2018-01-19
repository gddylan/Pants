package com.example.dylan.pantheons.model;

import com.example.dylan.pantheons.model.cards.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dylan on 1/19/2018.
 */

public class Location {
    public Point slot;
    public List<Point> coveredBy = new ArrayList<>();
    public List<Point> covering = new ArrayList<>();
    public Card card = null;
    public Board board;

    // TODO(implement)
    public boolean destroyedByGod = false;

    public boolean active = false;

    public Location(Board board, int row, int order) {
        this.board = board;
        this.slot = new Point(row, order);
    }

    // Called on setup
    public void setCard(Card c)
    {
        card = c;
    }

    public void setActive()
    {
        active = true;
    }

    // TODO: the active part might have to be in board, not here
    public void removeCoveredByLocation(Point p)
    {
        coveredBy.remove(p);
        if (coveredBy.isEmpty())
        {
            active = true;
        }
    }

    public void addCoveredByLocation(Point p)
    {
        coveredBy.add(p);
    }

    public void addCoveringLocation(Point p)
    {
        covering.add(p);
    }
}
