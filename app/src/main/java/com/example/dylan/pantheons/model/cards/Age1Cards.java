package com.example.dylan.pantheons.model.cards;

import com.example.dylan.pantheons.model.Resource;
import com.example.dylan.pantheons.model.rewards.CoinReward;
import com.example.dylan.pantheons.model.rewards.PortReward;
import com.example.dylan.pantheons.model.rewards.ResourceReward;
import com.example.dylan.pantheons.model.rewards.Science;
import com.example.dylan.pantheons.model.rewards.VictoryPoints;

/**
 * Created by Dylan on 1/19/2018.
 */

public class Age1Cards {
    public static Card APOTHECARY = new Card(
            "Apothecary",
            CardType.Science,
            new ResourceCost(Resource.GLASS),
            null,
            Science.WHEEL,
            new VictoryPoints(1));

    public static Card WOOD1 = new Card(
            "wood1",
            CardType.Resource,
            new ResourceCost(1),
            null,
            new ResourceReward(Resource.WOOD));

    public static Card FREEWOOD = new Card(
            "freewood",
            CardType.Resource,
            null,
            null,
            new ResourceReward(Resource.WOOD));

    public static Card CLAY1 = new Card(
            "clay1",
            CardType.Resource,
            new ResourceCost(1),
            null,
            new ResourceReward(Resource.CLAY));

    public static Card FREECLAY = new Card(
            "freeclay",
            CardType.Resource,
            null,
            null,
            new ResourceReward(Resource.CLAY));

    public static Card ROCK1 = new Card(
            "rock1",
            CardType.Resource,
            new ResourceCost(1),
            null,
            new ResourceReward(Resource.ROCK));

    public static Card FREEROCK = new Card(
            "freerock",
            CardType.Resource,
            null,
            null,
            new ResourceReward(Resource.ROCK));

    public static Card WOODPORT = new Card(
            "woodport",
            CardType.Gold,
            new ResourceCost(3),
            null,
            new PortReward(Resource.WOOD));

    public static Card CLAYPORT = new Card(
            "clayport",
            CardType.Gold,
            new ResourceCost(3),
            null,
            new PortReward(Resource.CLAY));

    public static Card ROCKPORT = new Card(
            "rockport",
            CardType.Gold,
            new ResourceCost(3),
            null,
            new PortReward(Resource.ROCK));

    public static Card GLASS1 = new Card(
            "glass1",
            CardType.Resource,
            new ResourceCost(1),
            null,
            new ResourceReward(Resource.GLASS));

    public static Card PAPER1 = new Card(
            "paper1",
            CardType.Resource,
            new ResourceCost(1),
            null,
            new ResourceReward(Resource.PAPER));

    public static Card GOLD4 = new Card(
            "gold4",
            CardType.Gold,
            null,
            null,
            new CoinReward(4));

}
