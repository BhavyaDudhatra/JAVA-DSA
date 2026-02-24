class binToDec{
    public static double convert(int no){
        double ans=0,pow=0,rem;
        while(no>0){
            rem=no%10;
            ans=ans+(rem*(Math.pow(2, pow)));
            pow++;

            no/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(convert(1011));
    }
}