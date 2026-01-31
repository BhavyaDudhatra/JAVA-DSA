public class printRevNo {
    public static void main(String[] args) {
        int no=12345;
        while(no!=0){
            System.out.println(no%10);
            no/=10;
        }
    }
}
