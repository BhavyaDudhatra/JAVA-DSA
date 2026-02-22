public class primeInRange {
    public static void prime(int no){
        for(int i=2;i<=no;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        prime(10);
    }
}