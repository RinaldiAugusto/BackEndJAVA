package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Dog> dogList = new ArrayList<>();

        dogList.add(new Dog("India", 5));
        dogList.add(new Dog("Pupi", 10));
        dogList.add(new Dog("Flopi", 9));
        dogList.add(new Dog("Sofi", 8));
        dogList.add(new Dog("Zaira", 7));

        //Necesitamos guardar la lista en un disco
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Salida.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Metodo que guarda la lista
            oos.writeObject(dogList);
            oos.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        //Necesitamos recuperar la lista y mostrarla por pantalla
        List<Dog> otherDogList = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("Salida.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);
            otherDogList = (ArrayList)ois.readObject();
            ois.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        for (Dog dogs: otherDogList){
            System.out.println(dogs);
        }

    }
}
