import java.util.Scanner;
/**Two dimension array program **/
class ABCD{
	public static void main(String[] ar){
		int marks[][]= new int[10][2];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter rollnumber andmarks");
		for(int ii:marks){
			System.out.println("rollnumber");
			marks[i][0]=sc.nextInt();
			System.out.println("marks");
			marks[i][1]=sc.nextInt();
			}
		
		for(int jj:marks){
		System.out.println("rollnumber"+marks[j][0]+"marks"+marks[j][1]);
		}
	
}
}
