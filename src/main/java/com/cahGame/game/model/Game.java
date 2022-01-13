package com.cahGame.game.Model;

import java.util.HashMap;
import java.util.List;

import lombok.Data;


@Data
public class Game {
    /**
     * Unique Game Id for the current game.
     */
    private long gameID;
    /**
     * list of active players in a game instance
     */
    private List<Player> players;

    /**
     * Status of the overall game
     */
    private GameStatus status;

    /**
     * Phase of a game round
     */
    private GameStep step;

    /**
     * Current game's Judging player.
     */
    private Player judge;

    /**
     * Question card currently played
     */
    private QuestionCard question;

    /**
     * List of selected cards.
     */
    private List<AnswerCard> answers;
    
    /**
     * HashMap containg playerID as a long mapped to whether or not they placed their Answer Card
     */
    private HashMap<Long, Boolean> waitingForPlayer;

    
}
