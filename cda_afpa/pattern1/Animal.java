package cda_afpa.pattern1;

public abstract class Animal {

	private String name;
	private IFood food;

	//constructeur
	public Animal(String name) {
		this.name = name;
		this.food = new NoFood();
	}


	abstract public String display();

	abstract public String recevoirSoins();


	//getter et setter
	public IFood getFood() {
		return food;
	}

	public void setFood(IFood food) {
		this.food = food;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
