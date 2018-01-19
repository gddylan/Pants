package com.example.dylan.pantheons.model;

import com.example.dylan.pantheons.model.cards.Card;
import com.example.dylan.pantheons.model.cards.CardType;
import com.example.dylan.pantheons.model.rewards.Reward;
import com.example.dylan.pantheons.model.cards.RewardType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dylan on 1/17/2018.
 */


public class Player {
    public List<Card> cards = new ArrayList<>();

    public Map<CardType, List<Card>> cardMap = new HashMap<CardType, List<Card>>() {
        CardType.Military : new ArrayList<Card>()
    };
    private static final Map<CardType, List<Card>> myMap = createMap();
    private static Map<CardType, List<Card>> createMap()
    {
        Map<CardType,List<Card>> myMap = new HashMap<>();
        myMap.put(CardType.Resource, new ArrayList<Card>());
        myMap.put(CardType.Gold, new ArrayList<Card>());
        myMap.put(CardType.Military, new ArrayList<Card>());
        myMap.put(CardType.Science, new ArrayList<Card>());
        myMap.put(CardType.VictoryPoint, new ArrayList<Card>());
        myMap.put(CardType.Pantheon, new ArrayList<Card>());
        myMap.put(CardType.God, new ArrayList<Card>());
        myMap.put(CardType.Wonder, new ArrayList<Card>());
        myMap.put(CardType.ProgressPoint, new ArrayList<Card>());
        return myMap;
    }

    public int coins = 0;
    public List<String> links = new ArrayList<>();
    public List<Resource> resources = new ArrayList<>();
    public List<Resource> ports = new ArrayList<>();

    // not one bit of this has been implemented.
    public boolean hasEconomy = false;
    public boolean hasLinking4 = false;
    // and on and on for the one-off abilities

    public void add(Card c){
        cards.add(c);
        cardMap.get(c.type).add(c);

        for (Reward r : c.rewards)
        {
            r.apply(this);
        }
    }

    public void GetCostToPlayer(Card c) {

    }
}
