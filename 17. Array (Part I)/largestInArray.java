import java.util.*;
class largestInArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int arr[]=new int[10];
        System.out.println("Enter 10 Elements : ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max number is : "+max);
        sc.close();
    }
}