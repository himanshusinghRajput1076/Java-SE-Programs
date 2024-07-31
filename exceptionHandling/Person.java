package exceptionHandling;

public class Person {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "age"+age+"name"+name;
    }

    public Person(int age, String name){
        this.age=age;
        this.name=name;

    }
}
