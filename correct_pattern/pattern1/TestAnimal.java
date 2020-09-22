package com.philou.cda.pattern1;

// 2 OBJETS QUI RELISENT UNE MEME INTERFACE SONT DE LA MEME FAMILLE

/**
 *
 * @author philou
 */
public class TestAnimal {
    
    public static void perform(){
        
        Animal chaton = new Chat("Chaton");
        Animal flipper = new Dauphin("Flipper");
        
        System.out.println(chaton.getName() + " " + chaton.getFood().manger());
        System.out.println(flipper.getName() + " " + flipper.getFood().manger());
        
        // Chaton mange un Twix
        chaton.setFood(new Twix());
        // Flipper mange du Sheba
        flipper.setFood(new Sheba());
        
        System.out.println(chaton.getName() + " " + chaton.getFood().manger());
        System.out.println(flipper.getName() + " " + flipper.getFood().manger());
        
        Veterinaire leVeto = new Veterinaire();
        
        System.out.println("Chaton passe chez le Véto ==> " + leVeto.soigner(chaton));
        System.out.println("Chaton passe chez le Véto ==> " + leVeto.soigner(flipper));
        
    }
    
}
