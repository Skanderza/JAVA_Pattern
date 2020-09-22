package cda_afpa.pattern1;

public class TestAnimal {
	
	public static void perform(){
		Animal chaton = new Chat("chaton");
		Animal flipper = new Dauphin("Flipper");
		
		
		System.out.println(chaton.getName() + " " + chaton.getFood().manger());
		System.out.println(flipper.getName() + " " + flipper.getFood().manger());
		
		
		//chaton mange un twix
		chaton.setFood(new Twix());
		//flipper mange un sheba
		flipper.setFood(new Sheba());
		
		
		
		System.out.println(chaton.getName() + " " + chaton.getFood().manger());
		System.out.println(flipper.getName() + " " + flipper.getFood().manger());
		
		
		Veterinaire leveto = new Veterinaire();
		
		System.out.println("Chaton passe chez le veto ===>" + leveto.soigner(chaton));
		System.out.println("Flipper passe chez le veto ===>" + leveto.soigner(flipper));
		
		
	}

}
