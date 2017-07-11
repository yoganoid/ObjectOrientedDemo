
package errordemo;

import java.util.Scanner;

public class ErrorDemo {

  //This short programs show's how to execute exception errors.
    
    public static void main(String[] args) {
        int num, deno;
        
        Scanner input = new Scanner(System.in);
        
        try
        {
            System.out.print("Please enter the numerator: ");
            num = input.nextInt();
            
            System.out.print("Please enter the denominator: ");
            deno = input.nextInt();
            
            System.out.println("The result is " + num/deno);
        }
        catch (Exception e)
                {
                    //If one were to make num=any number divided by deno=0 will result in this exception
                    System.out.println(e.getMessage());
                }
        finally
                {
                    System.out.println("---- End of Error Handling Example ----");
                }
    }
    
}
