import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len=sc.nextInt();
        int arr[]=new int[len];
        int arr2[]=new int[len];
        System.out.println("Enter array : ");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\nArray 1 : ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<len;i++){
            arr2[(len-1)-i]=arr[i];
        }
        System.out.println("\n\nArray 2 : ");
        for(int i=0;i<len;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
