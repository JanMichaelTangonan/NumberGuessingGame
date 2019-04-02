import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        System.out.println("Give me a random number from 0 to 100.");

        Scanner chosenNumber = new Scanner(System.in);


        int pickedNumber;

        int number;
        pickedNumber = (int) (Math.random() * 100);

        System.out.println(pickedNumber);


        //Results indicators (detects if the game needs repeating or not)
        do{
            number = chosenNumber.nextInt();

            if (pickedNumber == number) {
                System.out.println("Congratulations you have finally guessed the random number!");
                }


            else if(pickedNumber > number) {

                System.out.println("Your chosen number is lower than the random number that we have chosen, guess again!");
            }

            else if (pickedNumber < number) {

                System.out.println(("Your chosen number is higher than the random number that we have chosen, guess again!"));

            }
        }while(pickedNumber!=number);




        /*Counting how many tries are allowed (Need to fix number of tries.)
        if (wingame==true){
            System.out.println("It took you " + numberOfTries + " guess to get the number correctly.");

        }*/
    }





}




