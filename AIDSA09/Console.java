import java.io.Console;
class ConsoleExam{
	public static void main(String[] args){
		System.out.println("using console");
		Console con = System.console();
		if(con!=null){
			con.printf("enter your name %n");
			String name = con.readLine();
			con.printf("Hello,%s !%n",name);
		}
		else{
			System.out.println("Console not available");
			}
	}	
}