import java.util.Scanner;
class Scanner_class {
	public static void main(String[] args){
		
		Scanner dt = new Scanner(System.in);
		System.out.println("----scanner class-----");
		System.out.println("enter your name:");
		String name = dt.next();
		dt.nextLine();
		System.out.println("Enter your collage name:");
		String collage = dt.nextLine();
		System.out.println("Enter your roll number:");
		int Rollnumber = dt.nextInt();
		System.out.println("Enter your 1st year marks:");
		float marks = dt.nextFloat();
		dt.close();

		System.out.println("------Your details---------");
		System.out.println("HI "+name);
		System.out.println(" From Collage :"+collage);
		System.out.println("Your roll number:"+ Rollnumber);
		System.out.println("you Got :"+ marks);
		
		}




}
