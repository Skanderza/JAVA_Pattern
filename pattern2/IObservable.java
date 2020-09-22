package pattern2;




public interface IObservable {
	
	void addObserver(IObserver obs);
	void removeObserver(IObserver obs);
	void notifier();

}
