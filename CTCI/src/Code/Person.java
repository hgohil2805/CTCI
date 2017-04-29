package Code;

/**
 * Created by iceman on 4/24/2017.
 */
public class Person {
    String firstName;
    String lastName;

    Person(){
        System.out.println("Default Constructor");
    }

    public static void main(String args[]){
        Person p = new Person();
        p.firstName = "Menghe";
        p.lastName = "Wen";

        System.out.println(p.firstName + " " +p.lastName);
    }

    static{
        System.out.println("Will be called before the constructor");
    }

}
