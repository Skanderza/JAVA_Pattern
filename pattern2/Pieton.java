package pattern2;

public class Pieton implements IObserver{
    
     private String name;

    public Pieton(String name) {
        this.name = name;
    }
    
        @Override
    public void refresh(IObservable observable) {
        
        // C'est un feu rouge
        if(observable instanceof Signal){
            
            if(((Signal) observable).isVert()){
            System.out.println("Pieton:" + name + ((Signal) observable).getName() + " Le feu est VERT: j'attends"  );
            }
            else{  
            System.out.println("Pieton:" + name + ((Signal) observable).getName() +" Le feu est ROUGE: je traverse"  );
            }
        
         }
        
        // C'est un feu rouge
        if(observable instanceof Pluie){
            
            if(((Pluie) observable).isRaining()){
            System.out.println("Pieton:" + name + ((Pluie) observable).getName() + " parapluie ON"  );
            }
            else{  
            System.out.println("Pieton:" + name + ((Pluie) observable).getName() +" parapluie OFF"  );
            }
        
         }
    
    
}

 String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
     


	 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
     
}
