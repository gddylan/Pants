package com.example.dylan.pantheons.model.rewards;

import com.example.dylan.pantheons.model.Player;
import com.example.dylan.pantheons.model.rewards.Reward;

/**
 * Created by Dylan on 1/19/2018.
 */

public enum Science implements Reward {
    WHEEL,
    QUILL,
    PESTLE,
    TRIANGLE,
    GLOBE,
    SUNDIAL,
    LAW;

    @Override
    public void apply(Player p)
    {
        p.addScience(this);
    }
}
