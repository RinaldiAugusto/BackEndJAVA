package _4_IntroBackEnd._1_TestJUnit.Ejercicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GroupTest {

    /*
    Dadas 5 personas(Juan, Pedro, Ana, Luz y Julian) y una coleccion vacia de objetos tipo Persona, cuando se intentan agregar
    estas a la coleccion, el tamaño de la coleccion deberia ser 2.
     */

    @Test
    void caseOne(){
        //DADO
        Person person = new Person("Juan", 22);
        Person person1 = new Person("Pedro", 22);
        Person person2 = new Person("Ana", 22);
        Person person3 = new Person("Luz", 22);
        Person person4 = new Person("Julian", 22);
        Group group = new Group();

        //CUANDO
        group.addPerson(person);
        group.addPerson(person1);
        group.addPerson(person2);
        group.addPerson(person3);
        group.addPerson(person4);

        //ENTONCES -> el tamaño de la coleccion sea 2
        Assertions.assertTrue(group.getPeople().size() == 2);

    }

    /*
    Dadas 5 personas (18 años, 17, 22, 14 y 32) el tamaño de la coleccion deberia ser 3...
     */
    @Test
    void caseTwo(){
        //DADO
        Person person = new Person("Juani", 18);
        Person person1 = new Person("Pedro", 17);
        Person person2 = new Person("Analia", 22);
        Person person3 = new Person("Luz", 14);
        Person person4 = new Person("Julian", 32);
        Group group = new Group();

        //CUANDO
        group.addPerson(person);
        group.addPerson(person1);
        group.addPerson(person2);
        group.addPerson(person3);
        group.addPerson(person4);

        //ENTONCES -> el tamaño de la coleccion sea 2
        Assertions.assertTrue(group.getPeople().size() == 3);
        //        assertEquals(3, group.getPeople().size());
    }
}