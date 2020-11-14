import java.util.*;
public class BirthdayReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Write your code here
        int count=0;
        final String SENTINEL = "ZZZ";
        String[] names = new String[10];
        String[] birthdays = new String[10];
        String entry;
        int indexSearched ;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name " );
        entry = input.nextLine();

        while( !entry.equals(SENTINEL) && count<10 ) {
            names[count] = entry ;

            System.out.println("Enter the birthday of the " + names[count]);
            birthdays[count] = input.nextLine();

            count++; // count at 10 at the end
            if(count ==10)
                break;
                
            System.out.println("Enter a name  or " + SENTINEL + " to stop.");
            entry = input.nextLine();
            

        }
        //count--;
        
        
        System.out.println( count + " names where entered. \n");

        for(int a = 0; a < count; ++a)
            System.out.print(names[a] + " ");
        System.out.println("------------ BIRTHDAY SEARCHING ---------------");

         
        System.out.println("Enter the name your are looking for the birthday");
        entry = input.nextLine();

        
        while( !entry.equals(SENTINEL) ) {
        	indexSearched=-1 ; 
        	for(int x = 0; x < count; ++x)
            {
                if(entry.equals( names[x] )) {
                	indexSearched = x;
                	break;
                }
                
            }
        	
        	
        	if(indexSearched != -1) {
        		System.out.println("Birthday of " + entry + " is " + birthdays[indexSearched]);
        	}else {
        		System.out.println("Sorry, no entry for " + entry);
        	}
        	
        	System.out.println("Enter ANOTHER name your are looking for the birthday or ZZZ to stop");
            entry = input.nextLine();
            

        	
        }
        
        
        // End of the program
        System.out.println("\n------------ END . THANK YOU - November 13th is my BIRTHDAY ---------------");
            input.close();
        
	}

}
