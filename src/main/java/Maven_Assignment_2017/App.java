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

    //error syntax

{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yours Name: ");
        String name = input.nextLine();
        //commentary
        PrintWriter save = new PrintWriter("name.txt");
        save.print(name);
        save.close();
        //another commentary
        Scanner read = new Scanner(new File("name.txt"));
        System.out.println(read.nextLine());
    }
}
