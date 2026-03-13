import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        int first=0,last=arr.length,mid=(last-first)/2,flag=0,cnt=0;
        // int first,last,mid;
        System.out.print("Enter a number you want to find(1-9) : ");
        int no=sc.nextInt();

        while(true){
            if(mid==no){
                flag=1;
                break;
            }else if(mid>no){
                last=mid;
                mid=(first+last)/2;
            }else if(mid<no){
                first=mid;
                mid=(first+last)/2;
            }
            cnt++;
            if(cnt==arr.length){
                break;
            }
        }
        if(flag==1){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found!!!");
        }
    }
}
