package _3_Patrones._2_State;

public class Pou {
    private String name;
    private PouState currentState;

    public Pou(String name) {
        this.name = name;
        currentState = new PouStateHappy();
    }

    public void play(){
        this.currentState = this.currentState.play();
    }

    public void sleep(){
        this.currentState = this.currentState.goToSleep();
    }

    public void eat(){
        this.currentState = this.currentState.getFood();
    }

    public PouState getCurrentState() {
        return currentState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentState(PouState currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "Tu pou " + name + " se siente " + currentState;
    }


}
