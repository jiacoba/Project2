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
    
    double[][] scores = new double[5][4];
    String[] names = new String [5]; 
    
    
    public static void displayData(String [] mynames,double [][]myscores)
    {
    
    }
    
    public static void computeAverages(String [] str, double [][] stuscores)
    {
        
    }
    
    public static void determineLetterGrade(char [] letter, double [][]stuscores)
    {
    
    }
    
    public static void displayData2(String [] names, double [][] scores, char [] letters)
    {
    
    }
    
    public static void line (int numdash)
    {
    
    }
    
    public static void main (String [] args)
    {
        
        // The name of the file to open.
        String fileName = "project2IN.txt";

        // This will reference one line at a time
        String line = null;
        String text = "";
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                text = line;
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
           
        }
        
        System.out.println(text);

        
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
        
        
        
        
        
    }
}
     
        
    
    
    
    

