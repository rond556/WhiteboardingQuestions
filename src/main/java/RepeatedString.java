public class RepeatedString {

    /*
    Lilah has a string, s , of lowercase English letters that she repeated infinitely many times.

    Given an integer, n , find and print the number of letter a's in the first n letters of Lilah's infinite string.

    Ron's note (Overall for loop TIMES OUT, DO NOT USE)
     */

    public int aCounter(int subStringLength, String targetString){
        int numberOfSubStrings = subStringLength / targetString.length();
        int remainderOfLastSubstring = subStringLength % targetString.length();
        int totalCount = findTheNumbersOfAs(targetString,targetString.length())
                * numberOfSubStrings
                + findTheNumbersOfAs(targetString, remainderOfLastSubstring);
        return totalCount;
    }

    public int findTheNumbersOfAs(String targetString, int length) throws StringIndexOutOfBoundsException{
        if(targetString.length() == 0) {
            throw new NullPointerException();
        }

        int aCount = 0;
        for(int i = 0; i < length; i++){
            if(targetString.charAt(i) == 'a'){
                aCount++;
            }
        }
        return aCount;
    }
}
