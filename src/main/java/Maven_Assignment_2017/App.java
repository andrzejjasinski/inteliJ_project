package Maven_Assignment_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * save and read from .txt file
 *
 */
public class App 

{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yours Name: ");
        String name = input.nextLine();

        PrintWriter save = new PrintWriter("name.txt");
        save.print(name);
        save.close();

        Scanner read = new Scanner(new File("name.txt"));
        System.out.println(read.nextLine());
    }
}