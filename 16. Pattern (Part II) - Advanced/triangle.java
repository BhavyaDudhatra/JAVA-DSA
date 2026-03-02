class triangle{
    public static void main(String[] args) {
        int no=6;
        for(int i=0;i<no;i++){
            for(int j=0;j<i;j++){
                if((i+j)%2==0){
                    System.out.print(0 + " ");
                }else{
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}