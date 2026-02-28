public class floydsTriangle {
    public static void main(String[] args) {
        int no=1,len=5;
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                System.out.print(no++ + " ");
            }
            System.out.println();
        }
    }
}
