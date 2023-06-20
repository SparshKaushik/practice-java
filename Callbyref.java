class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Callbyref {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before calling the method: " + person.name);

        changeName(person);
        System.out.println("After calling the method: " + person.name);
    }

    public static void changeName(Person p) {
        p.name = "Bob";
    }
}
