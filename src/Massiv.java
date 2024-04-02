public class Massiv {
    public static void main(String[] args){
        int[] numb =new int[7];
        for(int i = 0; i< numb.length; i++) {
            numb[i] = i*10;
        }
        for(int i = 0; i< numb.length;i++) {
            System.out.println(numb[i]);
        }
        System.out.println();
        int[] numb1 = {1,2,3};
        for (int i=0; i<numb1.length; i++) {
            System.out.println(numb1[i]);
        }
    }
}
