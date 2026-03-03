public class butterflyPattern {
    public static void main(String[] args) {
        int no=5;
        for(int i=0;i<no;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<=2+(no-(2*i));k++){
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=no-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<=2+(no-(2*i));k++){
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
