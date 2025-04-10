package _2_POO.zPatrones._2_State;

public class PouStateTired implements PouState{
    @Override
    public PouState play() {
        System.out.println("Im feel tired after play");
        return this;
    }

    @Override
    public PouState getFood() {
        System.out.println("Im feel tired after eat");
        return this;
    }

    @Override
    public PouState goToSleep() {
        System.out.println("Im feel happy after sleep");
        return new PouStateHappy();
    }
}
