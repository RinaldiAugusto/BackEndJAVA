package _2_POO.Objets;

public class Main {
    public static void main(String[] args){
        User user1 = new User("Augusto", 1);
        User user2 = new User("Matias", 1);

        // ToString (Modificado)
        System.out.println(user1);
        System.out.println(user2);

        // Equals (Modificado)
        System.out.println(user1.equals(user2));



    }
}
