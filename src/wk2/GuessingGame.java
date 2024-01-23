package wk2;

import java.util.Random;

public class GuessingGame {

    /*
        properties
            specific values

            min value
            max value
            number to guess ?  or randomly generate it?
            track guesses
            max guesses
            user guess

        methods
            specific actions
                constructor: initial method to set up the class
            check if user guess is correct
     */

    int trackGuesses = 0;
    static final int MAX_GUESSES = 3;

    int minValue, maxValue;
    Random random = new Random();
    int numberToGuess;

    //special method => constructor

    public GuessingGame(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;

        generateRandomNumber();

    }
    void generateRandomNumber(){
        numberToGuess = random.nextInt(minValue, maxValue + 1);
    }
    boolean checkUserGuess(int guess){
        return guess == numberToGuess;
    }
}
