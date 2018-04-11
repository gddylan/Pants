package com.example.dylan.pantheons.model.rewards;

import com.example.dylan.pantheons.model.Player;

/**
 * Created by ddyla on 2/2/2018.
 */

public class MilitaryReward implements Reward {
    private int amt;

    public MilitaryReward(int amtToAdvance) {
        this.amt = amtToAdvance;
    }

    public void apply(Player p) {
        //TODO: MilitaryManager.advance(amt, p);
    }
}
