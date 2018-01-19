package com.example.dylan.pantheons.model.rewards;

import com.example.dylan.pantheons.model.Player;
import com.example.dylan.pantheons.model.Resource;

/**
 * Created by Dylan on 1/17/2018.
 */

public class ResourceReward extends Reward {
    private Resource resource;
    private int numResources;

    public ResourceReward(Resource r)
    {
        resource = r;
        numResources = 1;
    }

    public ResourceReward(Resource r, int amount)
    {
        resource = r;
        numResources = amount;
    }

    public void apply(Player p) {
        for (int i = 0; i < numResources; i++)
        {
            p.resources.add(resource);
        }
    }
}
