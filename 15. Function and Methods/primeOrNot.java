public class primeOrNot {
    public static int prime(int no){
        int res=0;
        for(int i=2;i<=Math.sqrt(no);i++){
            if(no%i==0){
                res=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int res=prime(72);
        if(res==1){
            System.out.println("this is not prime.");
        }else{
            System.out.println("Thsi is prime numebr.");
        }
    }
}
