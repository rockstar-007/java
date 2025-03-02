import java.util.Scanner;
class DynInt{
	public static void main(String[] args){
		
		Scanner Obj = new Scanner(System.in);

		System.out.println("Enter Value of a:");
		double a = Obj.nextDouble();
		if(a<0){
			System.out.println("A is less than 0 ");
		}
		else{
			System.out.println("Your A value is :"+ a);
		}
		System.out.println("Enter Value of b:");
		double b = Obj.nextDouble();
		if(b<0){
			System.out.println("A is less than 0 ");
		}
		else{
			System.out.println("Your B value is :"+ b);
		}
		double c=Math.sqrt(a*a+b*b);
		System.out.println("Hypotenuse is "+ c);
		Obj.close();
}
}
