import java.util.Scanner;
public class Check_marks{
	public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		if(marks>=90 && marks<=100){
			System.out.println(" You got A+ Grade"+name);
		}
		if(marks>=80 && marks<=90){
			System.out.println("You got A Grade "+name);
		}
		else if(marks>=70 && marks<=80){
			System.out.println("You got B Grade "+name);
		}
		else if(marks>=60 && marks<=70){
			System.out.println("You got C Grade "+name);
		}
		else if(marks>=50 && marks<=60){
			System.out.println("You got D Grade "+name);
		}
		else if(marks>=45 && marks<=50){
			System.out.println("You got A Grade "+name);
		}
		else if(marks<45){
			System.out.println("Better luck next time\n);
		}
		else{
			System.out.println("Enter Marks Correctly\n");
		}
		
		
		sc.close();
		}

}
