import java.util.Scanner;
class Calculator{
	double result=0.0;
	double first;
	double second;
	public Calculator(final double f, final double s) {
		this.first=f;
		this.second=s;
			
	}
	private void add() {
		this.result= this.first+ this.second;
	}
	private void sub() {
		this.result= this.first- this.second;
	}
	private void mul() {
		this.result= this.first* this.second;
	}
	private void div() {
		if(this.second==0) {
			System.out.println("Division with zero not possible.");
		}
		else {
		this.result= this.first/ (int)this.second;
		char operator='/';
		display(operator);
		}
	}
	private void display(char operator) {
		System.out.println(this.first + " " + operator + " " + this.second + " = " + this.result);
		System.out.println("TypeCasting:Explicit");
		System.out.println("Integer value of result:"+" "+(int)this.result);
	}
	public static void main(String  args[]) {
		System.out.println("Arithmetic Calculator");
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double n1 = reader.nextDouble();
	    double n2 =reader.nextDouble();
	    Calculator obj =new Calculator(n1,n2);
	    System.out.println("Enter an operator:(+, -, *, / )");
	    char operator = reader.next().charAt(0);
	    switch(operator) {
	    case '+':
	    	obj.add();
	    	obj.display(operator);
	    	break;
	    case '-':
	    	obj.sub();
	    	obj.display(operator);
	    	break;
	    case '*':
	    	obj.mul();
	    	obj.display(operator);
	    	break;
	    case '/':
	    	obj.div();
	    	break;
	    default:
	    	System.out.println("you have entered incorrect operator");
	    	break;
	    }
	    reader.close();
				
	}
	    
}