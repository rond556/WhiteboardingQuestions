import java.io.IOException;

public class TwoDArrayDS {

    /*
    Given a 6x6 2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for
every hourglass in , then print the maximum hourglass sum.

Function Description

Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the
array.

hourglassSum has the following parameter(s):

arr: an array of integers
    */

    public Integer findTheHourGlassSums(Integer[][] sixBySixArray) throws IOException {
        if(sixBySixArray.length != 6){
            throw new IOException("Array is the wrong size");
        }
        Integer largestSum = -63;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                if(sixBySixArray[j][i] > 9 || sixBySixArray[j][i] < -9){
                    throw new IOException("Please enter an integer between -9 and 9");
                }
                Integer currentSum = 0;
                currentSum += sixBySixArray[j][i] +
                        sixBySixArray[j - 1][i - 1] + sixBySixArray[j - 1][i] + sixBySixArray[j - 1][i + 1] +
                        sixBySixArray[j + 1][i - 1] + sixBySixArray[j + 1][i] + sixBySixArray[j + 1][i + 1];
                if(currentSum > largestSum){
                    largestSum = currentSum;
                }
            }
        }
        return largestSum;
    }
}
