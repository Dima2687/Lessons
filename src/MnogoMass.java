public class MnogoMass {
    public static void main(String[] args){
        int[][] matr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        for(int i=0; i< matr.length;i++){
            for(int j=0;j<matr[i].length;j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
