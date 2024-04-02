import java.util.Scanner;

public class OperSwitch {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("введи возраст");
        int age = a.nextInt();
        switch (age){
            case 0:
                System.out.println("ты родился");
            break;
            case 7:
                System.out.println("ты пошёл в школу");
                break;
            case 18:
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("ни один из чисел не подходит");

        }
    }
}
