import java.io.*;
import java.util.*;

/**
 * Write a description of class Gradebook here.
 * 
 * Tyler Neubecker
 * Jason Iacoban
 * 
 * 1/30/18
 */
public class NeubeckerIacobanGradebook
{
    
    
    Float[][] scores = new Float[5][4];
    String[] names = new String [5]; 
    
    
    public static void displayData(String [] mynames,Float [][]myscores)
    {
    
    }
    
    public static void computeAverages(String [] str, Float [][] stuscores)
    {
        
    }
    
    public static void determineLetterGrade(char [] letter, Float [][]stuscores)
    {
    
    }
    
    public static void displayData2(String [] names, Float [][] scores, char [] letters)
    {
    
    }
    
    public static void line (int numdash)
    {
    
    }
    
    public static void main (String [] args) throws IOException
    {
        String fileName = "project2IN.txt";
        Scanner keyboard = new Scanner(new File(fileName));
        
        String token1 ="";
        
        
        List<String> temps = new ArrayList<String>();
        
        while(keyboard.hasNext()){
            
            token1 = keyboard.next();
            temps.add(token1);
            
        }
        
        String[] tempsArray = temps.toArray(new String[0]);
        
        for (String s : tempsArray)
        {
            System.out.println(s);
            
        }
        
        
        
       List<Float> ntemps = new ArrayList<Float>();
        
        while(keyboard.hasNext())
        {
            
            Float token2 = keyboard.nextFloat();
            ntemps.add(token2);
            
        }
        keyboard.close();
        
        Float[] numTemp = ntemps.toArray(new Float[0]);
        
        
         for (Float x : numTemp)
         
                {
                    System.out.println(x);
   
                }
        
         /*
        try {
            keyboard = new Scanner(new FileInputStream(fileName));
                
            boolean tokenFound = false;
                
            while(keyboard.hasNextLine())
                {
                    String line = keyboard.nextLine().trim();
                    
                    if (line.equals("BGSTART"))
                    {
                        tokenFound = true;
                    } else if (line.equals("BGEND"))
                    {
                        System.out.println(line);
                    }
                    
                    if (tokenFound == true)
                    {
                        System.out.println(line);
                    }
                    
                }
        }
        
            catch (Exception e) 
            {
                System.out.println("File not found.");
            }
        
        
        
        
        
       
        // The name of the file to open.
        String fileNameOut = "project2OUT.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileNameOut);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        */
        
        
        
        
    }
}
     
        
    
    
    
    

