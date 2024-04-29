import java.util.*;

public class TestScores {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        final int SIZE = random.nextInt(8-3)+3;

        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        System.out.printf("Enter your %d test scores\n",SIZE);

        for(int i = 0; i < testScores.length; i++){
            System.out.printf("Enter test %d score:",(i+1));
            testScores[i] = Integer.parseInt(scanner.nextLine());
        }
        for(int i = 0; i < testScores.length; i++){
            letterGrades[i] = getLetterGrade(testScores[i]);
        }
        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);

        scanner.close();

    }
    public static char getLetterGrade(int testScore){

        char letterGrade;
        
        if(testScore >= 90){
            letterGrade = 'A';
        }else if(testScore <= 89 && testScore >=80){
            letterGrade = 'B';
        }else if(testScore <= 79 && testScore >=70){
            letterGrade = 'C';
        }else if(testScore <= 69 && testScore >=60){
            letterGrade = 'D';
        }else{
            letterGrade = 'F';
        }
        return letterGrade;
    }
    public static void printGrades(int testScores[], char letterGrade[]){
        System.out.printf("\n%-14s %-14s\n","Score","Grade");
        for(int i = 0; i < testScores.length; i++){
            System.out.printf("%-14d %-14c\n",testScores[i],letterGrade[i]);
        }
    }
    public static void printHighestScore(int testScore[])
    {
        int highScore = 0;
        for(int i = 0; i < testScore.length; i++) {
            if (testScore[i] > highScore) {
                highScore = testScore[i];
            }
        }
        System.out.printf("\nThe highest score is %d%n",highScore);

    }
    public static void printLowestScore(int testScore[]){
        int lowScore = 200;
        for(int i = 0; i < testScore.length; i++){
            if(testScore[i] < lowScore){
                lowScore = testScore[i];
            }
        }
        System.out.printf("The lowest score is %d%n",lowScore);
    }
    public static void printAverageScore(int testScore[]){
        int sum = 0;
        for(int i = 0; i < testScore.length; i++){
            sum = testScore[i] + sum;
        }
        double average = sum/testScore.length;
        System.out.printf("Average score is %.1f", average);
    }
}
