import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File fileOne = new File("courses.txt");

        try{
            Scanner scnr = new Scanner(fileOne);

            String header = scnr.nextLine();
            System.out.printf("%s",header);

            while(scnr.hasNextLine()){
                String course = scnr.next();
                int credits = Integer.parseInt(scnr.next());
                int score = Integer.parseInt(scnr.next());

            }
            scnr.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
