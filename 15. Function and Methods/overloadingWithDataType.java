public class overloadingWithDataType {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float x, float y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println("sum of A and b is : "+sum(1,2));
        System.out.println("Sum of X and Y is : "+sum(1.1f,2.2f));
    }
}
