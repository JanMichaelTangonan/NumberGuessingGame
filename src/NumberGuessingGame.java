import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        System.out.println("Give me a random number from 0 to 100.");

        Scanner chosenNumber = new Scanner(System.in);
        int number = chosenNumber.nextInt();

        int pickedNumber;

        pickedNumber = (int) (Math.random() * 100);

        System.out.println(pickedNumber);

        int numberOfTries = 0;
        numberOfTries++;
        boolean wingame= false;
        int repeat = 0;
        boolean continueGame =true;


        //Results indicators (detects if the game needs repeating or not)
        while (wingame==false){


            if (pickedNumber == number) {
                System.out.println("Congratulations you have finally guessed the random number!");
                }break;

        }


        while(continueGame==true){

            if (pickedNumber > number) {

                System.out.println("Your chosen number is lower than the random number that we have chosen, guess again!");
                
            }

            else if (pickedNumber < number) {

                System.out.println(("Your chosen number is higher than the random number that we have chosen, guess again!"));

            }
        }



        //Counting how many tries are allowed (Need to fix number of tries.)
        if (wingame==true){
            System.out.println("It took you " + numberOfTries + " guess to get the number correctly.");

        }
    }





}




