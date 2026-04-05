import java.util.*;
public class introduction {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter X exis : ");
        int x=sc.nextInt();
        System.out.print("Enter Y exis : ");
        int y=sc.nextInt();
        int arrr[][]=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("Enter Element for '"+x +" : "+ y+"'");
                arrr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Your Elements : \n");
        for(int j=0;j<x;j++){
            for(int i=0;i<y;i++){
                
                System.out.print(arrr[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
