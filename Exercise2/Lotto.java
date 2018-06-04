package Exercise2;

import java.util.Random;

public class Lotto {
    static int matches = 0;
    // declare a 5 integer array to store the winning numbers
    int[] lotteryNumbers = new int[5];

    // no-arg constructor that randomly generates 5 winning numbers
    public Lotto() {
        Random quickPick = new Random();
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = quickPick.nextInt(9);
        }
    }

    /**
     * Accessor for the lotteryNumbers array.
     *
     * @return The lotteryNumbers array
     */
    public int[] getWinningNumbers() {
        return lotteryNumbers;
    }

    /**
     * public method to compare a user's lottery picks to the winning numbers.
     * Each time through the inner loop if a match is found the numbers are
     * changed so they can't be matched again on subsequent iterations.
     *
     * @param array An array of 5 integers to compare to the winning numbers
     * @return The number of matches
     */
    public int addAllLottoNumber() {


        for (int i = 0; i < lotteryNumbers.length; i++) {


            // increment the matches accumulator
            matches=matches+lotteryNumbers[i];

        }
        return matches;
    }
}
