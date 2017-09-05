package file_io_principles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile
{

	public static void main(String[] args)
	{
		copy("input_files/war and peace.txt", "output_filds/war_and_peace.txt");
	}

	public static void appendTo(String source, String destination)
	{
		//passing true to the FileOutputStream constructor means "append mode"
		try (Scanner reader = new Scanner(new FileInputStream(source));
				PrintWriter writer = new PrintWriter(new FileOutputStream(destination, true)))
		{
			while (reader.hasNextLine())
			{
				String line = reader.nextLine();
				System.out.println(line);
			}

		} catch (FileNotFoundException e)
		{
			System.out.println("Error copying file from " + source + " to " + destination);
		}
	}

	public static void copy(String source, String destination)
	{
		try (Scanner reader = new Scanner(new FileInputStream(source));
				PrintWriter writer = new PrintWriter(new FileOutputStream(destination)))
		{
			while (reader.hasNextLine())
			{
				String line = reader.nextLine();
				System.out.println(line);
			}

		} catch (FileNotFoundException e)
		{
			System.out.println("Error copying file from " + source + " to " + destination);
		}
	}
}
