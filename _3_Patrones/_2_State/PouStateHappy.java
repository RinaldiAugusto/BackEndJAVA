package _3_Patrones._2_State;

public class PouStateHappy implements PouState{
    @Override
    public PouState play() {
        System.out.println("Im feel happy after play");
        return this;
    }

    @Override
    public PouState getFood() {
        System.out.println("Im feel tired after eat");
        return new PouStateTired();
    }

    @Override
    public PouState goToSleep() {
        System.out.println("Im feel hungry after sleep");
        return new PouStateHungry();
    }

}
