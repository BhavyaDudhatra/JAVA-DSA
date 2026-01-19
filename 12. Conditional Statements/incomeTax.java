import java.util.*;
public class incomeTax {
    public static void main(String[] args) {
        int tax;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your salary : ");
        int salary=sc.nextInt();
        if(salary<500000){
            tax=0;
        }else if(salary>=50000 && salary <=1000000){
            tax=20;
        }else{
            tax=30;
        }
        System.out.println("Your gross salary is : " + (salary+((salary*tax)/100)));
    }
}
