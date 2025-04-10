package _2_POO.zPatrones._4_Observer;

public interface Observable {
    public void notifyAllObserver();
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
}
