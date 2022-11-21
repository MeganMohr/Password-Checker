import java.util.Scanner;
public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        //ask user for password
        System.out.println("Your password must be at least 8 characters long and may only consist of letters and digits. Please enter your password: ");
        String password = scanner.nextLine();
        
        //call the password checker function. 
        System.out.println(passwordCheck(password));
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        
        //create a string of alphabet to compare to user password. 
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        //combined alpahbet uppercase, lowercase and numbers to simplify code and 
        //make it easier to read and write the program. 
        
        if(password.length() < 8)
        {
            return false;
        }
        for(int i = 0; i < password.length(); i++)
        {
            String letter = password.substring(i, i+1);
            
            //this if statement will ask if the character is in the list of
            //usable characters, if not, it will return false. 
            if(alphabet.indexOf(letter) < 0)
            {
                return false;
                //returns false if password is not valid. 
                //means that there is a letter not in the list of usable characters. 
            }
            
        }
        //returns true if password is valid!
        return true;
        
    }
}