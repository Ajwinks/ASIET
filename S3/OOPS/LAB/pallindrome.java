//AJWIN KS
//ROLL NO:4
//PALLINDROME
import java.util.*;

class palindrome
{
    public static void main(String args[])
        {
			String str,rev ="";
            Scanner S1= new Scanner(System.in);
            System.out.println("Enter the string");
            str=S1.nextLine();
            
            int len = str.length();
            for(int i=len-1;i>=0;i--)
            {
            	rev = rev + str.charAt(i);
            }
            if(rev.equals(str))
            {
				System.out.println("The string is Palindrome");            
            }
            else{
            	System.out.println("The string is not palindrome");
            }
            
            S1.close();
        }

}

