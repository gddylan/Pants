package com.example.dylan.pantheons.model.cards;

import com.example.dylan.pantheons.model.rewards.Reward;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Dylan on 1/17/2018.
 */

public class Card {
    // The name of the card.
    public String name;

    // What type of card this is.
    public CardType type;

    // The coin/resource cost printed on the card.
    public ResourceCost resourceCost;

    // The alternate cost printed on the card, if any (i.e. linking, pantheon).
    public String alternateCost;

    // The reward you gain for acquiring this card;
    public List<Reward> rewards;

    public Card(String name, CardType t, ResourceCost rCost, String aCost, Reward... r)
    {
        type = t;
        resourceCost = rCost;
        alternateCost = aCost;
        rewards = Arrays.asList(r);
    }

    // The number of coins it would cost the player to purchase this card, based on their resources.
    public int getCostToPlayer(){
        return 12;
    }
}
