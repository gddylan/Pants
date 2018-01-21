package com.example.dylan.pantheons.model.cards;

import com.example.dylan.pantheons.model.Resource;
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


}
