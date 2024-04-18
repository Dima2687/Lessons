package PakEn;

public class Test {
    public static void main(String[] args){
       Animal animal = Animal.CAT;
       System.out.println(animal.getTranslation());
       switch (animal){
           case CAT:
               System.out.println("It's a cat");
               break;
           case DOG:
               System.out.println("It's a dog");
               break;
       }
    }

}
