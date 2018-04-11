package com.example.dylan.pantheons.model.rewards;

import com.example.dylan.pantheons.model.Player;
import com.example.dylan.pantheons.model.Resource;

/**
 * Created by ddyla on 2/3/2018.
 */

public class PortReward implements Reward {
    private Resource[] resources;

    public PortReward(Resource... r)
    {
        resources = r;
    }

    public void apply(Player p) {
        for (Resource r : resources)
        {
            p.ports.add(r);
        }
    }
}
