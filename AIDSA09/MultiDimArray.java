import java.util.Scanner;
/**Two dimension array program **/
class MultiDimArray{
	public static void main(String[] ar){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter rollnumber andmarks");
		int marks[][]= new int[10][2];

		for(int i=0;i<marks.length;i++){
			System.out.println("rollnumber");
			marks[i][0]=sc.nextInt();
			System.out.println("marks");
			marks[i][1]=sc.nextInt();
			}
		for(int j=0;j<marks.length;j++){
		System.out.println("rollnumber"+marks[j][0]+" marks"+marks[j][1]);
		}
}
}