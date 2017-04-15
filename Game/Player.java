/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author ibad_
 */
public class Player {
    private final String name;
    private int totalScore;

    Player(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    int getTotalScore(){
        return totalScore;
    }

    void setTotalScore(int score){
        totalScore += score;
    }

}
