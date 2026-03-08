public class arrFuncArg {
    public static void add(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            arr1[i]++;
        }
        // return arr1;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        System.out.print("Before in main : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        add(arr);
        System.out.print("After in main : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
