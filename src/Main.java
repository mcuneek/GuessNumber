import java.util.Scanner;

public class Main {
 public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     boolean playAgain;

     do{
         GuessNumber game = new GuessNumber();
         game.isPlay(sc);
         System.out.println("Do You Want To play again (yes / no ) ?? ");
         playAgain = sc.next().equalsIgnoreCase("yes");

     }while(playAgain);

     System.out.println("Thank You For Choosing game ");
     sc.close();

 }

}