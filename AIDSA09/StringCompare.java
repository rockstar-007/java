class StringCompare{
	public static void main(String[] args){
		String s1 = "Hel";
		String s2 = "Hello";
		String s3 = "Hello";
		String s4 = "tonight";
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2==s3);
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println(s4.equalsIgnoreCase("TONIGHT"));
		System.out.println(s4.charAt(2));
	}
}