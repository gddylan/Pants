package com.example.dylan.pantheons.model.cards;

import com.example.dylan.pantheons.model.Resource;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Dylan on 1/17/2018.
 */
public class ResourceCost {
    public int coins;
    public List<Resource> resources;

    public ResourceCost(Resource... r)
    {
        this(0, r);
    }

    public ResourceCost(int c, Resource... r)
    {
        coins = c;
        resources = Arrays.asList(r);
    }
}