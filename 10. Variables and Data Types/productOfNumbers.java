import java.util.*;
public class productOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number : ");
        int no1=sc.nextInt();
        System.out.print("Enter Second number : ");
        int no2=sc.nextInt();
        int pro=no1*no2;
        System.out.println("Product of " + no1 + " and " + no2 + " : " + pro);
    }
}