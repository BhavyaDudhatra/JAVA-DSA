class pyramid{
    public static void main(String[] args) {
        int no=5;
        for(int i=0;i<no;i++){
            for(int j=i;j<no;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}