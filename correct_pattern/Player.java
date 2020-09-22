package com.philou.cda;

/**
 *
 * @author philou
 */
public class Player extends Object{
    
    private String name;
    private int score;
    private static int highScore;

    
    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        
        
    }

    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the highScore
     */
    public static int getHighScore() {
        return highScore;
    }

    /**
     * @param aHighScore the highScore to set
     */
    public static void setHighScore(int aHighScore) {
        highScore = aHighScore;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", score=" + score + '}';
    }
    
}
