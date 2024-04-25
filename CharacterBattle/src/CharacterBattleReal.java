import java.util.Random;
import java.util.Scanner;

public class CharacterBattleReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player2Name,  player2Move;
        String player1Name, player1Move;
        int player1Score = 0, player2Score = 0, player1HP, player2HP, player1MovePower, player2MovePower, player1Speed, player2Speed, numRounds;
        boolean even = false;

        do{
            System.out.print("Enter in an odd number of rounds: ");
            //4 -->7
            // numRounds = scanner.nextInt();
            numRounds = Integer.parseInt(scanner.nextLine());
            if(numRounds%2 == 0){
                System.out.println("That number is not odd. try again");
            }else{
                even = true;
            }
        }while(!even);


        for(int i = 0; i <numRounds; i++){
            //Ask player 1 questions
            System.out.println("Player 1, What is the name of your character?: ");
            player1Name = scanner.nextLine();

            System.out.println("Player 1, How much HP does your character have?: ");
            player1HP = Integer.parseInt(scanner.nextLine());

            System.out.println("Player 1, What is the name of their move?: ");
            player1Move = scanner.nextLine();

            System.out.println("Player 1, What is the power of the move?: ");
            player1MovePower = Integer.parseInt(scanner.nextLine());

            System.out.println("Player 1, What is the speed of your character?: ");
            player1Speed = Integer.parseInt(scanner.nextLine());

            String player1Stats = String.format("%s \n HP:%d \n Move:%s \n Power:%d \n Speed:%d", player1Name, player1HP, player1Move, player1MovePower, player1Speed);
            System.out.println(player1Stats);

            //ask player 2 questions
            System.out.println("Player 2, What is the name of your character?: ");
            player2Name = scanner.nextLine();

            System.out.println("Player 2, How much HP does your character have?: ");
            player2HP = Integer.parseInt(scanner.nextLine());

            System.out.println("Player 2, What is the name of their move?: ");
            player2Move = scanner.nextLine();

            System.out.println("Player 2, What is the power of the move?: ");
            player2MovePower = Integer.parseInt(scanner.nextLine());

            System.out.println("Player 2, What is the speed of your character?: ");
            player2Speed = Integer.parseInt(scanner.nextLine());

            String player2Stats = String.format("%s \n HP:%d \n Move:%s \n Power:%d \n Speed:%d", player2Name, player2HP, player2Move, player2MovePower, player2Speed);
            System.out.println(player2Stats);


            do{
                if (player1Speed > player2Speed) {
                    player2HP = player2HP - player1MovePower;
                    System.out.println(player2Name+"'s HP:"+player2HP);
                    if (player2HP < 1) {
                        System.out.println("Player 1 wins the round!");
                        player1Score = player1Score + 1;
                        break;
                    }
                    player1HP = player1HP - player2MovePower;
                    System.out.println(player1Name+"'s HP:"+player1HP);
                    if (player1HP < 1) {
                        System.out.println("Player 2 wins the round!");
                        player2Score = player2Score + 1;
                        break;
                    }

                } else if (player2Speed > player1Speed) {
                    player1HP = player1HP - player2MovePower;
                    System.out.println(player1Name+"'s HP:"+player1HP);
                    if (player1HP < 1) {
                        System.out.println("Player 2 wins the round!");
                        player2Score = player2Score + 1;
                        break;
                    }
                    player2HP = player2HP - player1MovePower;
                    System.out.println(player2Name+"'s HP:"+player2HP);
                    if (player2HP < 1) {
                        System.out.println("Player 1 wins the round!");
                        player1Score = player1Score + 1;
                        break;
                    }

                } else {
                    Random random = new Random();
                    int randomInt = random.nextInt(2);
                    if (randomInt == 1) {
                        player1HP = player1HP - player2MovePower;
                        System.out.println(player1Name+"'s HP:"+player1HP);
                        if (player1HP < 1) {
                            System.out.println("Player 2 wins the round!");
                            player2Score = player2Score + 1;
                            break;
                        }
                        player2HP = player2HP - player1MovePower;
                        System.out.println(player2Name+"'s HP:"+player2HP);
                        if (player2HP < 1) {
                            System.out.println("Player 1 wins the round!");
                            player1Score = player1Score + 1;
                            break;
                        }
                    } else{
                        player2HP = player2HP - player1MovePower;
                        System.out.println(player2Name+"'s HP:"+player2HP);
                        if (player2HP < 1) {
                            System.out.println("Player 1 wins the round!");
                            player1Score = player1Score + 1;
                            break;
                        }
                        player1HP = player1HP - player2MovePower;
                        System.out.println(player1Name+"'s HP:"+player1HP);
                        if (player1HP < 1) {
                            System.out.println("Player 2 wins the round!");
                            player2Score = player2Score + 1;
                            break;
                        }
                    }

                }
            } while (player1HP > 0 && player2HP > 0);
    }
        String scoreOutput = String.format("Player 1 Score: %d \nPlayer 2 Score: %d",player1Score, player2Score);
        System.out.println(scoreOutput);
        if (player1Score > player2Score){
            System.out.println("Player 1 wins the battle!");
        }else if (player2Score > player1Score){
            System.out.println("Player 2 wins the battle!");
        }

}
}
