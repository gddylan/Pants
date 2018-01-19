package com.example.dylan.pantheons.model.rewards;

import com.example.dylan.pantheons.GameState;
import com.example.dylan.pantheons.model.Player;
import com.example.dylan.pantheons.model.cards.RewardType;

/**
 * Created by Dylan on 1/17/2018.
 */

public abstract class Reward {
    public abstract void apply(Player p);
}