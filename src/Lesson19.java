public class Lesson19 {
    public static void main(String[] args){
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Maks");
        human1.getInfo();
    }
}
class Human{
    String name;
    int age;

    public void setName(String theName){              //сеттер
        name = theName;
    }
    public void setAge(int myAge){
        age = myAge;
    }
    public String getName(){                         //геттер
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name+" "+age);
    }
}
