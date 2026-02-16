import java.util.*;
public class factorial {
    public static int findFactorial(int no){
        int fact=1;
        for(int i=1;i<=no;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int no=sc.nextInt();
        int factorial=findFactorial(no);
        System.out.println("Factorial of "+no+" is "+factorial);
        sc.close();
    }
}
