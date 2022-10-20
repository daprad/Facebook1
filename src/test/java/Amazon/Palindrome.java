package Amazon;

public class Palindrome {
	public void isPalindrome() {
		 String str="bob";  
		 
	        StringBuilder strBuilder = new StringBuilder(str);
	        StringBuilder b = strBuilder.reverse();
	        System.out.println(b);
	        System.out.println(str);
	        boolean equals = str.equals(b);
		    System.out.println(equals); }
	 public static void main(String[] args) {
		Palindrome s = new Palindrome() ;
		s.isPalindrome();
	 }}
		
	


