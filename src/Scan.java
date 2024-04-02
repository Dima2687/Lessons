import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("введите что-нибудь");
        String a =x.nextLine();
        System.out.println("вы ввели "+a);
    }
}
