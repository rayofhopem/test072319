package strings;

public class Palindrome {
	
	public static boolean isPalindrome(String s)
	{
		for (int i = 0, j=s.length()-1; i<j; ++i, --j )
		{
			if (s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		boolean after = Palindrome.isPalindrome("liril");
		System.out.println(after);
		
		
		
	}

}
