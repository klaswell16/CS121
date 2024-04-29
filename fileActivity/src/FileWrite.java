import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("courses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        Scanner scnr = new Scanner(System.in);

        String course;
        int credits, score;

        output.printf("%s %s %s\n", "course", "credits", "score");
        for(int i = 1; i <= 2; i++){
            System.out.printf("Enter name of course %d:", i);
            course = scnr.nextLine();

            System.out.println("Enter the course credits:");
            credits = Integer.parseInt(scnr.nextLine());

            System.out.println("Enter the course score:");
            score = Integer.parseInt(scnr.nextLine());

            output.printf("%s %d %d\n", course, credits, score);

        }
        output.close();
    }
}
