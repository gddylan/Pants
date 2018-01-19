package com.example.dylan.pantheons.model.rewards;

import com.example.dylan.pantheons.model.Player;

/**
 * Created by Dylan on 1/17/2018.
 */

public class CoinReward extends Reward {
    private int numCoins;

    public CoinReward(int numCoins) {
        this.numCoins = numCoins;
    }

    public void apply(Player p) {
        p.coins += numCoins;
    }
}
