
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private  int random ;
    private  int attempts ;

    public GuessNumber(){
        this.random = generateRandom(1,100);
        this.attempts = 3;
    }

    private int generateRandom(int i, int i1) {
        Random num = new Random();
        return num.nextInt(100 -1 +1 )+1;
    }

    public  void isPlay(Scanner sc){
        System.out.println("Guess number (1 to 100)  :: " + attempts + " Are The Chances ");
       for(int i = 1 ; i <= attempts; i++) {
           int user = getUser(sc, i);
           if (user == random) {
               System.out.println("Congratulation You Guess Number is Corrected !!!");
               return;
           }
           if (user < random) {
               System.out.println(" Incorrect PLease try another Chances ");
           }
       }
       System.out.println("Your losses The Game  !! The Correct Number is " + random );


    }

    public  static int getUser(Scanner sc, int attempts) {
        System.out.println("Attempts  " + attempts + " : Enter you guess Number ");
        if(!sc.hasNext()){
            System.out.println("Invalid Enter ");
            sc.nextInt();

        }
        return sc.nextInt();
    }


}
