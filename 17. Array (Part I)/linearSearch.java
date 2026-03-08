import java.util.*;
class linearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        System.out.print("Enter the number you want to find : ");
        int no=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==no){
                System.out.print("Index : "+i);
                break;
            }
        }
    }
}