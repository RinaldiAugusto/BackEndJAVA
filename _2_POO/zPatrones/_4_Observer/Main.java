package _2_POO.zPatrones._4_Observer;

public class Main {
    public static void main(String[] args){
        Reader reader = new Reader("Augusto",  19);
        Reader reader1 = new Reader("Miguel", 86);
        NewsPaper newsPaper = new NewsPaper("La voz");

        newsPaper.addObserver(reader);
        newsPaper.addObserver(reader1);

        newsPaper.publish();

    }
}
