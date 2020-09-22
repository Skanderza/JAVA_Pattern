package com.philou.cda.pattern1;

/**
 *
 * @author philou
 */
public class Dauphin extends Animal{

    public Dauphin(String name) {
        super(name);
    }

    
    
    @Override
    public String display() {
        
        return "LOOK LIKE A DOLPHIN";
    }


    @Override
    public String recevoirSoins() {
        return "CARE FOR DOLPHIN";
    }
    
    
    
}
