package _3_Patrones._2_State;

public class PouStateHungry implements PouState{
    @Override
    public PouState play() {
        System.out.println("Im feel hungry after play");
        return new PouStateHungry();
    }

    @Override
    public PouState getFood() {
        System.out.println("Im feel happy after eat");
        return new PouStateHappy();
    }

    @Override
    public PouState goToSleep() {
        System.out.println("Im feel hungry after sleep");
        return this;
    }
}
