class swapNumbers{
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("A : "+a);
        System.out.println("B : "+b);
    }
    public static void main(String[] args) {
        int a=3, b=6;
        swap(a,b);
        System.out.println("A : "+a);
        System.out.println("B : "+b);
    }
}