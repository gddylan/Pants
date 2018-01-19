package com.example.dylan.pantheons.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dylan on 1/17/2018.
 */

public class Board {

    Map<Point, Location> locations = new HashMap<>();

    public Location getLocation(Point p)
    {
        return locations.get(p);
    }

    // Set up the board again when a card is taken
    public void onCardTaken(Location l)
    {
        for (Point p : l.covering)
        {
            getLocation(p).removeCoveredByLocation(l.slot);
        }
    }
}
