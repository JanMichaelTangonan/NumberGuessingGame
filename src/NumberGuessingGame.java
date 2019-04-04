import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        System.out.println("Give me a random number from 0 to 100.");

        Scanner chosenNumber = new Scanner(System.in);


        int pickedNumber;

        int userValue;

        int numberOfTries = 0;

        pickedNumber = (int) (Math.random() * 100);



        //Results indicators (detects if the game needs repeating or not)
        do{
            userValue = chosenNumber.nextInt();
            numberOfTries++;

            if (pickedNumber == userValue) {
                System.out.println("Congratulations you have finally guessed the random number!");
            }

            if (userValue==pickedNumber){

                System.out.println(pickedNumber);
            }


            else if(pickedNumber > userValue) {

                System.out.println("Your chosen number is lower than the random number that we have chosen, guess again!");
            }

            else if (pickedNumber < userValue) {

                System.out.println(("Your chosen number is higher than the random number that we have chosen, guess again!"));

            }

        }while(pickedNumber!=userValue);



        //Final results
        if (pickedNumber==userValue){
            System.out.println("It took you " + numberOfTries + " guess(es) to get the number correctly.");

        }
    }



}




