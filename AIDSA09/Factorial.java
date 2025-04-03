import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int f=1;
		System.out.println("Enter Number for fact");
		int FactNum = myObj.nextInt(); 
		for (int i=1;i<=FactNum;i++){
			f=f*i;
		}
		System.out.println("Factorial of "+FactNum+"is "+f);
}
}


