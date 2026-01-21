public class passFail {
    public static void main(String[] args) {
        float marks=223.45f;
        if(marks>100 || marks<0){
            System.out.println("Invalid Input");
        }else if(marks>33){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
