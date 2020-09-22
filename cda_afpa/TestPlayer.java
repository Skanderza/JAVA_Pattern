package cda_afpa;

public class TestPlayer {
	
	public static void perform() {
		   Player player1 = new Player();
	        Player player2 = new Player("toto");
	        Player player3 = new Player("tata", 5);

	        player1.setName("bob");
	        player2.setName("marine");

	        System.out.println(player1.getName());
	        System.out.println(player2.getName());
	        System.out.println(player3.getScore());
	}

}
