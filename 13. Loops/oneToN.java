import java.util.*;
public class oneToN {
    public static void main(String[] args) {
        System.out.print("Enter a number to print : ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt(), i=1;
        while(i<=no){
            System.out.println(i);
            i++;
        }
    }
}
