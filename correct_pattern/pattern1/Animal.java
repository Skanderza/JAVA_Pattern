package com.philou.cda.pattern1;

/**
 *
 * @author philou
 */
public abstract class Animal {
    
    private String name;
    private IFood food;

    public Animal(String name) {
        this.name = name;
        this.food = new NoFood();
    }

    abstract public String display();
    
    abstract public String recevoirSoins();
    
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
     * @return the food
     */
    public IFood getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(IFood food) {
        this.food = food;
    }
}
