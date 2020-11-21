//By @ravjs

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;
public class StudentsStanding {
    public static void main(String[] args) {
        Path goodFile = Paths.get("/root/sandbox/StudentsGoodStanding.txt");
        Path probFile = Paths.get("/root/sandbox/StudentsAcademicProbation.txt");
        
        // Write your code here
        final double PASSING_GRADE = 2.0;
        final String SENTINEL = "ZZZ";
		String entry, entryPhone, userEntries;
		Scanner input = new Scanner(System.in);

        byte[] data; 
        OutputStream output = null;
        double grade;


        //Creating the files
        try
        {
        	data = "".getBytes();
        	output = new BufferedOutputStream(Files.newOutputStream(goodFile, TRUNCATE_EXISTING) ); // We truncate the existing content Because the bot will do several creation on the same file
        	output.write(data);
        	output.flush();
        	output.close();

            output = new BufferedOutputStream(Files.newOutputStream(probFile, TRUNCATE_EXISTING) );
        	output.write(data);
        	output.flush();
        	output.close();
        	
        }
        catch(Exception e)
        {
            System.out.println("Error message: " + e);
        }
        // End of Creation



        System.out.println("Enter ID number or  " + SENTINEL + " To stop" );
        entry = input.nextLine();
        
        
		while( !entry.equals(SENTINEL)  ) {
            userEntries = ""; // Flushing our variable
            userEntries += entry; 
	        System.out.println("Enter first name of the student" );
	        userEntries += "," + input.nextLine();

            System.out.println("Enter last name of the student" );
	        userEntries += "," + input.nextLine();

            System.out.println("Enter grade point average of the student" );
            grade = Double.parseDouble ( input.nextLine() );
	        userEntries += "," + grade + "\n";
	        
	        // Inserting information into the file
	        try
	        {
	        	data = userEntries.getBytes();

                if(grade >= PASSING_GRADE)
	        	    output = new BufferedOutputStream(Files.newOutputStream(goodFile, APPEND) );
                else
	                output = new BufferedOutputStream(Files.newOutputStream(probFile, APPEND) );

	           
	        	output.write(data);
	        	output.flush();
	        	output.close();
	        	
	        }
	        catch(Exception e)
	        {
	            System.out.println("Error message: " + e);
	        }
	        
        System.out.println("Enter another ID number or  " + SENTINEL + " To stop" );
	        entry = input.nextLine();
	        
	
	    }
		
		input.close();
        System.out.println("-------------- END OF PROGRAM THANKS ----------");

        
        
    }
}
