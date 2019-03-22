import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        System.out.println("Give me a random number from 1 to 100.");

        Scanner chosenNumber = new Scanner(System.in);
        int number = chosenNumber.nextInt();

        int pickedNumber;

        pickedNumber = (int) (Math.random() * 100);

        System.out.println(pickedNumber);

        int numberOfTries = 0;
        numberOfTries++;
        boolean wingame= false;
        int repeat = 0;
        repeat++;
        boolean continueGame =true;


        while (wingame==false){

            //Results indicators (detects if the game needs repeating or not)
            if (pickedNumber == number) {

                System.out.println("Congratulations you have finally guessed the random number!");
                break;
            }


        }
        while(continueGame==true){

            if (pickedNumber > number) {

                System.out.println("Your chosen number is lower than the random number that we have chosen.");

            }

            else if (pickedNumber < number) {

                System.out.println(("Your chosen number is higher than the random number that we have chosen."));

            }
        }



        //Counting how many tries are allowed (Might be done.[not sure])
        if (wingame==true){
            System.out.println("It took you " + numberOfTries + " guess to get the number correctly.");

        }
    }





}




