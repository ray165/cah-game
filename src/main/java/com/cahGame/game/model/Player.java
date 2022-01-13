package com.cahGame.game.Model;

import lombok.Data;

@Data
public class Player{

    private long playerID;
    private String name;
    
    public Player(long playerID, String name){
        this.playerID = playerID;
        this.name = name; 
    }
}