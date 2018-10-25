import java.util.Scanner;
import java.io.File;

/**
 * ICE 10/23/2018 - Exercise 1
 * Finds the number of sentences in Frakenstein by counting the number 
 * of periods.
 *
 * @author Daniel Law
 * @version 10/23/2018
 */
public class CountSentences
{
    public static void main(String[] args)
    {
        try {
            File book = new File ("Mary Shelly Frankenstein.txt");      
            Scanner fin = new Scanner(book);
            
            int numSentences = 0;
            
            while ( fin.hasNext() )
            {
                String token = fin.next();
                
                // -- Your code BEGINS here
                
		// Here is an extra Berg comment just because

                //Find the last character by using the last index
                int lastIndex = token.length()-1;
                String lastChar = token.substring( lastIndex );
                
                //Check if the last character is a period
                if ( lastChar.equals(".") )
                    numSentences++;
                
                
                if ( token.substring( token.length()-1 ).equals(".") )
                    numSentences++;    
                
                    
                // -- Your code ENDS here
            }
            
            System.out.println("Number of sentences: " + numSentences);
        } catch (Exception e) {System.out.println(e);}
    }   
}
