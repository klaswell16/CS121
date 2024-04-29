import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter filewrite = new FileWriter("courses.txt",true);

            PrintWriter output = new PrintWriter(filewrite);

            Scanner scnr = new Scanner(System.in);

            System.out.println("Enter in the course name:");
            String course = scnr.nextLine();
            System.out.println("Enter in amount of credits:");
            int credits = Integer.parseInt(scnr.nextLine());
            System.out.printf("Enter course score:");
            int score = Integer.parseInt(scnr.nextLine());
            output.printf("%s %d %d", course, credits, score);
            scnr.close();


        }catch(FileNotFoundException e){
            System.err.println("File not found");
        }
    }
}
