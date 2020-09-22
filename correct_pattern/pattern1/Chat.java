package com.philou.cda.pattern1;

/**
 *
 * @author philou
 */
public class Chat extends Animal{

    public Chat(String name) {
        super(name);
    }

    
    
    @Override
    public String display() {
        
        return "LOOK LIKE A CAT";
    }


    @Override
    public String recevoirSoins() {
        return "CARE FOR CAT";
    }
    
}
