import java.util.*;

public class CharacterBattle {
   public static boolean even = false;

   public static int numRounds;
    public static String player1 ;
    public static String player2;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // condition for while loop


        //sout --> println
        //souf --> printf

        System.out.println();

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
            String user1Response = String.format("Player 1 choose your pokemon, type in its name:\n [Bulbasaur Charmander Squirtle Pidgey]");
            System.out.println(user1Response);
            player1 = scanner.nextLine().toLowerCase();
            //Method call returns string num string num num
            String player1Info = PlayerChoice(player1);
            System.out.println(player1Info);

            String user2Response = String.format("Player 2 choose your pokemon, type in its name:\n [Bulbasaur Charmander Squirtle Pidgey]");
            System.out.println(user2Response);//printing the above string
            player2 = scanner.nextLine().toLowerCase();//taking in the response from the above string and assigning it player2
            //method call
            //String player2Info = PlayerChoice(player2);
            String player2Info = "";

            if(player2.equals("bulbasaur|charmander|squirtle|pidgey")){
                String player2info = PlayerChoice(player2);
                System.out.println(player2Info);
            }else{
                System.out.println(player2Info);
            }

        }


    }

    public static String PlayerChoice(String Pokemon){

        String name;
        int hitPoints;
        String move;
        int movePower;
        int attackSpeed;
        String bulbasaur;
        String charmander;
        String squirtle;
        String pidgey;
        String output = "" ;
        switch (Pokemon)
        {
            case "bulbasaur":
                name = "Bulbasaur";
                hitPoints = 45;
                move = "Razor Leaf";
                movePower = 49;
                attackSpeed = 45;
                output = String.format("%s \n HP:%d \n Move:%s \n Move's Power:%d \n Speed:%d", name, hitPoints,move,movePower,attackSpeed);
                break;
            case "charmander":
                name = "Charmander";
                hitPoints = 39;
                move = "Flame Thrower";
                movePower = 52;
                attackSpeed = 65;
                output = String.format("%s \n HP:%d \n Move:%s \n Move's Power:%d \n Speed:%d", name, hitPoints,move,movePower,attackSpeed);
                break;
            case "squirtle":
                name = "Squirtle";
                hitPoints = 44;
                move = "Water Gun";
                movePower = 48;
                attackSpeed = 43;
                output = String.format("%s \n HP:%d \n Move:%s \n Move's Power:%d \n Speed:%d", name, hitPoints,move,movePower,attackSpeed);
                break;
            case "pidgey":
                name = "Pidgey";
                hitPoints = 40;
                move = "Wing Attack";
                movePower = 35;
                attackSpeed = 56;
                output = String.format("%s \n HP:%d \n Move:%s \n Move's Power:%d \n Speed:%d", name, hitPoints,move,movePower,attackSpeed);
                break;
            default:
                System.out.print("That is not an available pokemon");


                break;
        }

        return output;
    }

}
