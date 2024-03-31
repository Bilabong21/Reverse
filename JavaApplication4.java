import java.util.Scanner;
public class JavaApplication4 {

    public static void main(String[] args) {
      
	Scanner kb = new Scanner(System.in);
		
		String message = "Enter a single word: ";
		System.out.println(message);
		String word = kb.next();
		
		String reversed = reverse(word);
		System.out.println("Your revesed word is "+ reversed);
		boolean palindrome = isPalindrome(word,reversed);
		System.out.println(palindrome);
		
	}
	public static String reverse(String word)
	{
            String revString = " ";
	    char[] str = word.toCharArray(); 
            
            for(int i=str.length-1 ; i>=0; i-- )
            {
                revString = revString + str[i];
            }
        return revString;

        }
       public static boolean isPalindrome(String word, String reversed)
	{
		boolean ans = false;
		if(word.equals(reversed))
		{
			 ans = true;
			System.out.println("Your word has not changed at all");
		}
		else
		{
			System.out.println("Your word has changed");
		}
		return ans;
	}
}
