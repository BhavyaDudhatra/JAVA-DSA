import java.util.*;
public class doWhile {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter a number : ");
            i=sc.nextInt();
        }while(i<100);
        System.out.println("True! "+i);
    }
}
