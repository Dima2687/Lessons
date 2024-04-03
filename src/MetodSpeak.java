public class MetodSpeak {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Паша";
        person1.age = 50;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Дима";
        person2.age = 35;
        person2.speak();
        person1.sayHello();

    }
}
class Person {
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + ",мне " + age);
    }

    void sayHello() {
        for (int i = 0; i < 3; i++) {                        //повторение 3 раза
            System.out.println("Привет");
        }
    }
}
