package com.example.dylan.pantheons.model;

import com.example.dylan.pantheons.model.cards.Card;
import com.example.dylan.pantheons.model.cards.CardType;
import com.example.dylan.pantheons.model.rewards.Science;
import com.example.dylan.pantheons.model.rewards.Reward;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dylan on 1/17/2018.
 */


public class Player {
    public List<Card> cards = new ArrayList<>();

    public static final Map<CardType, List<Card>> cardMap = makeCardMap();
    private static Map<CardType, List<Card>> makeCardMap()
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

    public static final Map<Science, Integer> scienceMap = makeScienceMap();
    private static Map<Science, Integer> makeScienceMap()
    {
        Map<Science, Integer> myMap = new HashMap<>();
        myMap.put(Science.WHEEL, 0);
        myMap.put(Science.QUILL, 0);
        myMap.put(Science.PESTLE, 0);
        myMap.put(Science.TRIANGLE, 0);
        myMap.put(Science.GLOBE, 0);
        myMap.put(Science.SUNDIAL, 0);
        myMap.put(Science.LAW, 0);
        return myMap;
    }

    public int coins = 0;
    public int victoryPoints = 0;
    public List<String> links = new ArrayList<>();
    public List<Resource> resources = new ArrayList<>();
    public List<Resource> ports = new ArrayList<>();
    public List<Science> scienceSet = new ArrayList<>();

    // not one bit of this has been implemented.
    public boolean hasEconomy = false;
    public boolean hasLinking4 = false;
    // and on and on for the one-off abilities

    public void addCard(Card c){
        cards.add(c);
        cardMap.get(c.type).add(c);

        for (Reward r : c.rewards)
        {
            r.apply(this);
        }
    }

    public void addScience(Science s)
    {
        scienceSet.add(s);
        scienceMap.put(s, scienceMap.get(s) + 1);

        // If the player has 6 distinct science symbols, they win!
        if (scienceSet.size() >= 6)
        {
            // TODO: GameManager.declareVictory(VictoryCondition.SCIENCE, player);
        }

        // If the player has EXACTLY 2 of this science, not 1 or 3 (i.e. from Nisaba),
        // then acquire a Progress Point.
        if (scienceMap.get(s) == 2)
        {
            // TODO: ProgressPointManager.chooseAvailableProgressPoint();
        }
    }

    public void GetCostToPlayer(Card c) {

    }
}
