public class calculator{
	public static void main(String args[]){
		char op='+';
		int n1=3,n2=4;
		switch (op){
			case '/':
				System.out.println("Division : "+(n1/n2));
				break;
			case '*':
				System.out.println("Multiplication : "+(n1*n2));
				break;
			case '+':
				System.out.println("Addition : "+(n1+n2));
				break;
			case '-':
				System.out.println("Subtraction : "+(n1-n2));
				break;
			case '%':
				System.out.println("Remainder : "+(n1%n2));
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
}