package tp_personne_java;

public class TpPersonnes {
	
	 public static void test(){
	        
	        Personne bob = new Personne("Bob");
	        Personne monika = new Personne("Monika");
	        Personne kevin = new Personne("Kevin");
	        Personne katia = new Personne("Katia");
	        
	        System.out.println("Init");
	        // Etat des objets
	        System.out.println("bob=> " + bob);
	        System.out.println("monika=> " + monika);
	        System.out.println("kevin=> " + kevin);
	        System.out.println("katia=> " + katia);
	        
	        
	        // Bob se marrie avec Monika
	        bob.marriage(monika);
	        System.out.println("*** ACTION: Bob se marrie avec Monika");
	        // Etat des objets
	        System.out.println("bob=> " + bob);
	        System.out.println("monika=> " + monika);
	        System.out.println("kevin=> " + kevin);
	        System.out.println("katia=> " + katia);
	        
	        // Bob se marrie avec Katia
	        bob.marriage(katia);
	        System.out.println("*** ACTION: Bob se marrie avec Katia");
	        // Etat des objets
	        System.out.println("bob=> " + bob);
	        System.out.println("monika=> " + monika);
	        System.out.println("kevin=> " + kevin);
	        System.out.println("katia=> " + katia);
	        
	        // Bob divorce avec Monika
	        bob.divorce(monika);
	        System.out.println("*** ACTION: Bob divorce avec Monika");
	        // Etat des objets
			// ...
	        
	        // Bob se marrie avec Katia
	        bob.marriage(katia);
	        System.out.println("*** ACTION: Bob se marrie avec Katia");
	        // Etat des objets
			// ...
	        
	        // Kevin se marrie avec Katia
	        kevin.marriage(katia);
	        System.out.println("*** ACTION: Kevin se marrie avec Katia");
	        // Etat des objets
			// ...
	        
	        // Kevin divorce avec Katia
	        kevin.divorce(katia);
	        System.out.println("*** ACTION: Kevin divorce avec Katia");
	        // Etat des objets
			// ...
	        
	        // Kevin est ami avec Katia
	        kevin.gagneAmi(katia);
	        System.out.println("*** ACTION: Kevin est ami avec Katia");
	        // Etat des objets
			// ...
	        
	        // Kevin est ami avec Monika
	        kevin.gagneAmi(monika);
	        System.out.println("*** ACTION: Kevin est ami avec Monika");
	        // Etat des objets
			// ...
	        
	        // Kevin n'est plus ami avec Katia
	        kevin.perdAmi(katia);
	        System.out.println("*** ACTION: Kevin n'est plus ami avec katia");
	        // Etat des objets
			// ...
	        
	        // Kevin n'est plus ami avec Bob
	        kevin.perdAmi(bob);
	        System.out.println("*** ACTION: Kevin n'est plus ami avec Bob");
	        // Etat des objets
			// ...
	    }
	}