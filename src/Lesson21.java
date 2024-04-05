public class Lesson21 {
    public static void main(String[] args){
        Human2 h1 = new Human2("Bob",40);
        Human2 h2 = new Human2("Mark",15);
        Human2.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Human2.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();

    }
}
class Human2{
    private String name;
    private int age;
    public static String description;
    public Human2(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void getdiscription(){
        System.out.println(description);
    }
    public void getAllFields(){
        System.out.println(name+ " "+age +" "+description);
    }
}