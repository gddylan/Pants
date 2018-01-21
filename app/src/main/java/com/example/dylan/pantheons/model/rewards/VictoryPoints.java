package com.example.dylan.pantheons.model.rewards;

import com.example.dylan.pantheons.model.Player;

/**
 * Created by Dylan on 1/19/2018.
 */

public class VictoryPoints implements Reward {
    private int numVPs;

    public VictoryPoints(int VPs) {
        this.numVPs = VPs;
    }

    public void apply(Player p) {
        p.victoryPoints += numVPs;
    }
}