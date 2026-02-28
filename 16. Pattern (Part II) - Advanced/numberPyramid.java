public class numberPyramid {
    public static void main(String[] args) {
        int no=5;
        for(int i=1;i<=no;i++){
            int k=1;
            for(int j=i;j<=no;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
