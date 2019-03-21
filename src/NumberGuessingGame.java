import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        System.out.println("Give me a random number from 1 to 100.");

        Scanner chosenNumber = new Scanner(System.in);
        int number = chosenNumber.nextInt();

        int pickedNumber;

        pickedNumber = (int) (Math.random() * 100);

        System.out.println(pickedNumber);

        boolean repeatGame= true;

        while (repeatGame){

            //Results indicators (detects if the game needs repeating or not)
            if (pickedNumber > number) {

                System.out.println("Your chosen number is lower than the random number that we have chosen.");

            } else if (pickedNumber < number) {

                System.out.println(("Your chosen number is higher than the random number that we have chosen."));

            }

            if (pickedNumber == number) {

                System.out.println("You must have eaten lucky charms or something...");
                break;
            }

        }

        //Counting how many tries are allowed (DO NOT WORK ON JUST YET)
        for(int tries = 0;tries<30;){

        System.out.println("You have guessed too much, guess your just unlucky :(");
        }





    }
}



