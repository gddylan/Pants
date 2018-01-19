package com.example.dylan.pantheons.model.cards;

import com.example.dylan.pantheons.model.rewards.Reward;

import java.util.List;

/**
 * Created by Dylan on 1/17/2018.
 */

public class Card {
    // The coin/resource cost printed on the card.
    public ResourceCost resourceCost;

    // The alternate cost printed on the card, if any (i.e. linking, pantheon).
    public String alternateCost;

    // The reward you gain for acquiring this card;
    public List<Reward> rewards;

    public Card(ResourceCost rCost, String aCost, List<Reward> r)
    {
        resourceCost = rCost;
        alternateCost = aCost;
        rewards = r;
    }

    // The number of coins it would cost the player to purchase this card, based on their resources.
    public int getCostToPlayer(){
        return 12;
    }
}
