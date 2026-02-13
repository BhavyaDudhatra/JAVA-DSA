import java.util.*;
public class syntexWithParameters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter first value : ");
        a=sc.nextInt();
        System.out.print("Enter second value : ");
        b=sc.nextInt();
        sum(a,b);
    }
    static void sum(int a, int b){
        int c=a+b;
        System.out.println("Sum of A and B : "+c);
    }
}
