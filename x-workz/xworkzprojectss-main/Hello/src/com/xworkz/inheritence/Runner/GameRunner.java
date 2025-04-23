package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.game.Game;
import com.xworkz.inheritence.internal.game.Chess;

public class GameRunner {
    public static void main(String[] args) {

        Game game = new Game();
        game.play();
        game.strategy();
        game.opponent();
        game.winner();
        game.duration();
        System.out.println("**************************************");
        Game games = new Chess();
        games.play();
        games.strategy();
        games.opponent();
        games.winner();
        games.duration();

        System.out.println("**************************************");

        Chess chess = new Chess();
        chess.play();
        chess.strategy();
        chess.opponent();
        chess.winner();
        chess.duration();
    }
}
