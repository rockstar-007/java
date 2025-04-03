class Variable{
		static int m=100;
		void add(){
			int n=90;
			System.out.println("value of n: "+n);
			}
	public static void main(String[] args){
		int data = 50;
		System.out.println("the value of data is: "+data);
		System.out.println("The value of m is:"+ m);
		//add();
		Variable v1 = new Variable();
		v1.add();
		}

}