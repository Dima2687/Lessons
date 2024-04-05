public class Lesson20 {
    public static void main(String[] args){
        Human5 human1 = new Human5("Bob",15);
    }
}
class Human5{
    private String name;
    private int age;

    public Human5(String name, int age){
        System.out.println("привет из конструктора");
        this.name = name;
        this.age = age;
    }
}
