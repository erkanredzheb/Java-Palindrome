import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;


public class Palindrome{
    

    public static String readInput(){
        String userInput = null;
        
        try {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Please, enter a word: ");
            userInput = reader.readLine();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        return userInput;
        
    }
    
    public static boolean palindromeTest(String theInput){
        theInput = theInput.toLowerCase();
        char[] charArray = theInput.toCharArray();
        boolean isPalindrome = true;
        int j = charArray.length - 1;
            
	    for(int index=0; index<charArray.length / 2; index++)
	    {
	        if(charArray[index] != charArray[j])
	            isPalindrome = false;
	            j--;
	    }     
	        
	    return isPalindrome;
    }

	public static void main(String[] args) {
	    String theInput = null;
	    
	    while(true){
            theInput = readInput();

            if(palindromeTest(theInput))
                System.out.println("It's a Palindrome!");
            else
                System.out.println("Not a Palindrome!"); 
	    }
	}
}
