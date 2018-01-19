package com.example.dylan.pantheons.model;

import com.example.dylan.pantheons.model.cards.Card;
import com.example.dylan.pantheons.model.rewards.Reward;
import com.example.dylan.pantheons.model.cards.RewardType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dylan on 1/17/2018.
 */


public class Player {
    public List<Card> cards = new ArrayList<>();

    public List<Card> resourceCards = new ArrayList<>();
    public List<Card> goldCards = new ArrayList<>();
    public List<Card> militaryCards = new ArrayList<>();
    public List<Card> scienceCards = new ArrayList<>();
    public List<Card> vpCards = new ArrayList<>();
    public List<Card> pantheonCards = new ArrayList<>();
    public List<Card> gods = new ArrayList<>();
    public List<Card> wonders = new ArrayList<>();
    public List<Card> progressPoints = new ArrayList<>();

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
        addCardToTypedList(c);

        for (Reward r : c.rewards)
        {
            r.apply(this);
        }
    }

    private void addCardToTypedList(Card c) {

    }

    public void GetCostToPlayer(Card c) {

    }
}
