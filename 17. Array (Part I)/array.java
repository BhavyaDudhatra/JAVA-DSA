import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[10];
        // System.out.println(arr1);
        System.out.print("How many number you want to enter (less than 10) : ");
        int no=sc.nextInt();
        if(no>10){
            System.out.println("Invalid Input...");
        }else{
            for(int i=0;i<no;i++){
                System.out.print("Enter element for index "+i+" : ");
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<no;i++){
                System.out.print(arr1[i]+" ");
            }
            System.out.print("\nWhich index you want to update : ");
            int update=sc.nextInt();
            if(update>0 && update<no){
                System.out.print("Enter new number : ");
                int newval=sc.nextInt();
                arr1[update]=newval;
                for(int i=0;i<no;i++){
                    System.out.print(arr1[i]+" ");
                }
            }else{
                System.out.print("Invalid Value to update...");
            }
        }
                
    }
}
