import java.util.Scanner;
class DynInt{
	public static void main(String[] args){
		
		Scanner Obj = new Scanner(System.in);

		System.out.println("Enter Value of a:");
		double a = Obj.nextDouble();

		System.out.println("Enter Value of b:");
		double b = Obj.nextDouble();

		double c=Math.sqrt(a*a+b*b);
		System.out.println("Hypotenuse is "+ c);
		Obj.close();


}
}
