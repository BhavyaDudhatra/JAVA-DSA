import java.util.*;
public class revTheNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no=sc.nextInt();
        int rev=0;
        while(no!=0){
            rev*=10;
            rev=rev+(no%10);
            no/=10;
        }
        System.out.println(rev);
        sc.close();
    }
}
