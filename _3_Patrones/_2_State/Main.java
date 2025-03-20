package _3_Patrones._2_State;

public class Main {
    public static void main(String[] args){
        Pou pou = new Pou("Juan");

        System.out.println(pou.getCurrentState());

        pou.eat();
        System.out.println(pou.getCurrentState());

        pou.play();
        System.out.println(pou.getCurrentState());

        pou.sleep();
        System.out.println(pou.getCurrentState());

        pou.eat();
        System.out.println(pou.getCurrentState());

        pou.sleep();
        System.out.println(pou.getCurrentState());

        pou.play();
        System.out.println(pou.getCurrentState());

        pou.play();
        System.out.println(pou.getCurrentState());

        pou.sleep();
        System.out.println(pou.getCurrentState());

        pou.eat();
        System.out.println(pou.getCurrentState());
    }
}
