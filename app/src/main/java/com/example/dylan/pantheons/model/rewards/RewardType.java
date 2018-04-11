package com.example.dylan.pantheons.model.rewards;

/**
 * Created by Dylan on 1/17/2018.
 */

public enum RewardType {
    Coins,
    Resources,
    Port,
    Military,
    Science,
    VictoryPoints,
    ExtraTurn,

    // The rest probably don't need to exist, can just be handled uniquely
    DestroyResource,
    DestroyBoardCard,
    StealResource,
    StealWonder,
    BuildWonder,
    DestroyBuiltWonder,
    Minerva,
    Nisaba,
    DestroyMilitaryCoinBlocks,
    PlayFromDiscardPile,
    DrawUnusedProgressPoint,
    Economy
}