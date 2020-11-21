//By @ravjs

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class StudentsStanding2 {
    public static void main(String[] args) {
        Path goodFile = Paths.get("/root/sandbox/StudentsGoodStanding.txt");
        Path probFile = Paths.get("/root/sandbox/StudentsAcademicProbation.txt");
        // Write your code here

        String s = "";
	    InputStream input = null;
        

          System.out.println("Probationary Standing");

	      
	      try
	      {
	         input = Files.newInputStream(probFile) ;
	         
	         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
	         
	         s = reader.readLine();
	         while(s != null)
	         {
	            display(s); // Calling the ehanced display
	            s = reader.readLine();           
	         }
	         reader.close();
	      }
	      catch(Exception e)
	      {
	        System.out.println("Message: " + e);
	      }



          System.out.println("Good Standing");
	      s = "";
	      input = null;
	      try
	      {
	         input = Files.newInputStream(goodFile) ;
	         
	         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
	         
	         s = reader.readLine();
	         while(s != null)
	         {
	            display(s); // Calling the ehanced display
	            s = reader.readLine();           
	         }
	         reader.close();
	      }
	      catch(Exception e)
	      {
	        System.out.println("Message: " + e);
	      }
    }
    public static void display(String s) {
        // Write your code here
        final String DELIMITER = ",";
        final double PASSING_GRADE = 2.0;
        String[] array = new String[4]; 

        array = s.split(DELIMITER); 
        double grade = Double.parseDouble(array[3]);

        System.out.println("ID #" + array[0] + " " + array[1] + " " + array[2] + " GPA: " + array[3] + "  " + (grade - PASSING_GRADE) + " from " + PASSING_GRADE + " cutoff");


    }
}
