/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.leagueofidols.models;

import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author cahucadi
 * Data anotattion allows to create getters and setters
 */
@Data
public class Player implements  Comparable<Player>{
    
    private String playerName;
    private int level;
    private LocalDateTime created;

    public Player(String playerName, int level, LocalDateTime created) {
        this.playerName = playerName;
        this.level = level;
        this.created = created;
    }
    
    @Override
    public int compareTo(Player o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
