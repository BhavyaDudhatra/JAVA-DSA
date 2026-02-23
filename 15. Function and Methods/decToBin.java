public class decToBin {
    public static int convert(int no){
        int ans = 0;
        int place = 1;

        while(no != 0){
            int rem = no % 2;
            ans += rem * place;
            place *= 10;
            no /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(convert(6));
    }
}