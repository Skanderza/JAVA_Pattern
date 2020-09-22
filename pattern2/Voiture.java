package pattern2;

public class Voiture implements IObserver{
    
    private String name;

    public Voiture(String name) {
        this.name = name;
    }
    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void refresh(IObservable observable) {
        
        // C'est un feu rouge
        if(observable instanceof Signal){
            
            if(((Signal) observable).isVert()){
            System.out.println("Voiture:" + name + ((Signal) observable).getName() + " Le feu est VERT: je d�marre"  );
            }
            else{  
            System.out.println("Voiture:" + name + ((Signal) observable).getName() +" Le feu est ROUGE: je stoppe"  );
            }
         }
        
        // C'est un feu rouge
        if(observable instanceof Pluie){
            
            if( ((Pluie) observable).isRaining()){
            System.out.println("Voiture:" + name + ((Pluie) observable).getName() + " Essuie glaces ON"  );
            }
            else{  
            System.out.println("Voiture:" + name + ((Pluie) observable).getName() +" Essuie glaces OFF"  );
            }
         }
    
    
}
    
}


/*
    public void refresh(Signal s){
        
        if(s.isVert()){
            System.out.println("Voiture:" + name + " Le feu est VERT: je d�marre"  );
        }
        else{
            System.out.println("Voiture:" + name + " Le feu est ROUGE: je stoppe"  );
        }
        
    }
*/
