package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jpapp on 7/22/2017.
 */
public class driver
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner s = new Scanner(new File("C:\\Users\\jpapp\\OneDrive\\Google Drive\\College\\College\\football\\colleges.txt"));

        ArrayList<String> college;
        //college = new ArrayList<String>();

        while(s.hasNextLine())
        {
            college.add(s.nextLine());
        }
        System.out.println(college);
    }
}