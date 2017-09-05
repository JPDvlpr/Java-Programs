package grammarPack;

import java.io.*;
import java.util.*;

/*
 * Asks the user for a text file that has the grammar specifications
 * it then asks the user for a symbol from the grammar they'd like to generate
 * e.g. a sentence, and how many of them they'd like
 * it then goes through and displays
 */
public class Main 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
    	//introduction
        System.out.println("Welcome to our sentence generator!");
        System.out.println();

        // open grammar file
        System.out.print("What is the name of the grammar file? ");
        Scanner console = new Scanner(System.in);
        String fileName = console.nextLine();
        
        List<String> lines;
        
        try 
        {
        	lines = readLines(fileName);
        }
        catch(Exception e)
        {
        	System.out.println("Sorry that's not a valid file name");
        	return;
        }
        // construct grammar solver and begin user input loop
        Generator solver = new Generator(Collections.unmodifiableList(lines));
        
        // repeatedly prompt for symbols to generate, and generate them
        String symbol = getSymbol(console, solver);
        
        while (symbol.length() > 0) 
        {
            if (solver.contains(symbol)) 
            {
                doGenerate(console, solver, symbol);
            } 
            else 
            {
                System.out.println("Illegal symbol.");
            }
            
            symbol = getSymbol(console, solver);
        }
    }
    
    /*
     * Displays all non-terminal symbols, 
     * prompts for a symbol to generate,
     * and returns the symbol as a string.
     */
    public static String getSymbol(Scanner console, Generator solver) 
    {
        System.out.println();
        System.out.println("Available symbols to generate are:");
        Set<String> symbols = solver.getSymbols();
        System.out.println(symbols);

        System.out.print("What do you want to generate (Enter to quit)? ");
        String target = console.nextLine().trim();
        return target;
    }
    
    /*
     * Generates some number of instances of the given symbol.
     */
    public static void doGenerate(Scanner console, Generator solver, String symbol) 
    {
        System.out.print("How many do you want me to generate? ");
        
        if (console.hasNextInt()) 
        {
            int number = console.nextInt();
            
            if (number < 0) 
            {
                System.out.println("No negatives allowed.");
            }
            else 
            {
                System.out.println();
            
                for (int i = 0; i < number; i++) 
                {
                    String result = solver.generate(symbol);
                    System.out.println(result);
                }
            }
        } 
        else 
        {
            System.out.println("That is not a valid integer.");
        }
        
        console.nextLine();   // to position to next line
    }

    /*
     * Reads the text from the file with the given name and returns it all
     * as one big string.  Strips empty lines and trims leading/trailing 
     * whitespace from each line.  Throws a FileNotFoundException if the
     * file with the given name is not found.
     */
    public static List<String> readLines(String fileName) throws FileNotFoundException 
    {
        List<String> lines = new ArrayList<String>();
        Scanner input = new Scanner(new File("files/" + fileName));
    
        while (input.hasNextLine()) 
        {
            String line = input.nextLine().trim();
            
            if (line.length() > 0) 
            {
                lines.add(line);
            }
        }
        return lines;
    }
}
