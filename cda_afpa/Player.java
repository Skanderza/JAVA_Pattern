package cda_afpa;

public class Player {
	
	
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
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public static int getHighScore() {
		return highScore;
	}
	public static void setHighScore(int highScore) {
		Player.highScore = highScore;
	}
	

}
