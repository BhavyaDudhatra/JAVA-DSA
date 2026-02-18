public class binomialCoefficient {
    public static int findFactorial(int no){
        int fact=1;
        for(int i=1;i<=no;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binomial(int n, int r){
        int nf=findFactorial(n);
        int rf=findFactorial(r);
        int diff=findFactorial(n-r);
        int ans=nf/(rf*diff);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(binomial(5,2));
    }
}

// n!/r!(n-r)!