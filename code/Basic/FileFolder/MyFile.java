package Basic.FileFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MyFile {
    public static void main(String[] args) {
        // Create a new file
        // File file = new File("testfile.txt");
        // try{
        //     file.createNewFile();
        // } catch(IOException e){
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }

        //Code to write to a file
        // try{
        //     FileWriter writer=new FileWriter("testfile.txt");
        //     writer.write("Hello, this is a test file.");
        //     writer.close();
        // } catch(IOException e){
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }
        // //Code to read from a file
        // File file = new File("testfile.txt");
        // try{
        //     Scanner reader = new Scanner(file);
        //     while(reader.hasNextLine()){
        //         String line = reader.nextLine();
        //         System.out.println(line);
        //     }
        //     reader.close();
        // } catch(FileNotFoundException e){
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }
        //Code to delete a file
        File file = new File("testfile.txt");
        if(file.delete()){
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file");
        }
    }

}