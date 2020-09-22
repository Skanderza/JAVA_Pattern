package pattern2;

import java.util.ArrayList;
import java.util.List;

public class Pluie implements IObservable{
	
	private String name;
	private boolean raining;
	private List<IObserver> listeObservateurs;

	public Pluie(String name) {
		this.name = name;
		raining = false;
		listeObservateurs = new ArrayList();
	}

	@Override
	public void addObserver(IObserver o) {
		listeObservateurs.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		listeObservateurs.remove(o);
	}

	@Override
	public void notifier() {
		listeObservateurs.forEach( (o) -> {
			o.refresh(this);
		});  
	}

	/**
	 * @return the raining
	 */
	 public boolean isRaining() {
		return raining;
	}

	/**
	 * @param raining the raining to set
	 */
	 public void setRaining(boolean raining) {
		 this.raining = raining;
		 notifier();
	 }

}
