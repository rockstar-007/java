import java.util.Scanner;
public class Scanner_class{

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		// basic inputs methods
		System.out.println("Enter your name:");
		String name = scanner.next();
		scanner.nextLine();
		System.out.println("Enter your collage name: ");
		String collage = scanner.nextLine(); // Readthe whole line
		System.out.println("Enter your roll number: ");
		int rollNumber = scanner.nextInt();
		System.out.println("Enter your 1st sem marks %: ");
		float marks = scanner.nextFloat(); // variable decision
		scanner.close();
		System.out.println("---------your Details------");
		System.out.println("Name:"+ name);
		System.out.println("\n collage:"+ collage);
		System.out.println("\nRoll Number:"+ rollNumber);
		System.out.println("\n Percentage:"+ marks);

	}

}