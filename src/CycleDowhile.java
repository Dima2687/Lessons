import java.util.Scanner;

public class CycleDowhile {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        int b;
        do {
            System.out.println("введи 5");
            b= a.nextInt();
        }
        while (b!=5);
        System.out.println("вы ввели 5");
    }
}
