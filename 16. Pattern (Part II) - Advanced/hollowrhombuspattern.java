public class hollowrhombuspattern{
    public static void main(String[] args) {
        int no=5;
        for(int i=0;i<=no;i++){
            for(int j=i;j<=no;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=no;k++){
                if(k==0 || k==no || i==0 || i==no){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}