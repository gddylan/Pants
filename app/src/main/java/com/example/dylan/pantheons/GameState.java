package com.example.dylan.pantheons;

import com.example.dylan.pantheons.model.Board;
import com.example.dylan.pantheons.model.Player;

/**
 * Created by Dylan on 1/17/2018.
 */

public class GameState {
    private static Player player;
    public static Player getPlayer() {
        if (player == null) {
            player = new Player();
        }

        return player;
    }

    private static Player opponent;
    public static Player getOpponent() {
        if (opponent == null) {
            opponent = new Player();
        }

        return opponent;
    }

    public static int currentAge;
    public static Board currentBoard;
}
