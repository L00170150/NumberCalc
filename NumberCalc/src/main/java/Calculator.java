import java.util.Scanner;

public class Calculator {
	
	//1
	public static int add(int first,int second) {
		
		int result;
		result = first+second;
		return result;
		
	}
	//2
   public static int sub(int first,int second) {
		
		int result;
		result = first-second;
		return result;
		
	}
	//3
   public static int multi(int first,int second) {
		
		int result;
		result = first*second;
		return result;
		
	}
   //4
   public static int div(int first,int second) {
		
		int result;
		result = first/second;
		return result;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		 int first ;
		 int second;
		 int result;
		 int selection;
		 
		 Scanner sa = new Scanner(System.in);
		 System.out.println("Enter first number");
		 first=sa.nextInt();
		 System.out.println("Enter second number");
		 second=sa.nextInt();
		 
		 
		 System.out.println("choose the selection");
		 System.out.println("1.addition");
		 System.out.println("2.subtraction");
		 System.out.println("3.multiplication");
		 System.out.println("4.division");
		 
		 selection=sa.nextInt();
		 while(selection>4) {
			 System.out.println("please enter the correct selection :");
			 selection=sa.nextInt();
		 }
		 
		 if(selection==1) {
			 result= add(first,second);
			 System.out.println("The addition of two numbers " + result);
		 }else if(selection==2) {
			 result=sub(first,second);
			 System.out.println("The Subtraction of two numbers " + result);
		 }else if(selection==3) {
			 result=multi(first,second);
			 System.out.println("The Multiplication of two numbers " + result);
		 }else if(selection==4) {
			 result= div(first,second);
			 System.out.println("The Division of two numbers " + result);
		 }
		 		 

	}

}
