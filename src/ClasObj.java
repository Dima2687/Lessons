public class ClasObj {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Паша";
        person1.age = 50;
        System.out.println("Меня зовут "+person1.name+" мне "+person1.age);
        Person person2 = new Person();
        person2.name = "Дима";
        person2.age = 35;
        System.out.println("Меня зовут "+person2.name+" мне "+person2.age);
    }
}
class Person{
    String name;
    int age;
}