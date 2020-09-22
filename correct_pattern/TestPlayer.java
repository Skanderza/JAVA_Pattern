
package com.philou.cda;

/**
 *
 * @author philou
 */
public class TestPlayer {
    
    public static void perform(){
        
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player("Marlene");
        Player player4 = new Player("Mamadou", 20);
        
        //player1.name ="Bob";
        player1.setName("Bob");
        player2.setName("Monika");
        
        System.out.println(player1.getName());
        System.out.println(player2.getName());
        
        System.out.println(player1);
    }
    
}
