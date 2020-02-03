import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

    /*John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
    Given an array of integers representing the color of each sock, determine how many pairs of socks with
    matching colors there are.

    For example, there are  socks with colors . There is one pair of color  and one of color .
    here are three odd socks left, one of each color. The number of pairs is .
     */


    static int countingPairs(int[] sockCollection) {
        Map<Integer, Integer> sockCounter = new HashMap<>();
        int pairCounter = 0;

        for(Integer i : sockCollection){
            if(!sockCounter.containsKey(i)){
                sockCounter.put(i, 1);
            }
            else {
                sockCounter.put(i, sockCounter.get(i) + 1);
                if(sockCounter.get(i) % 2 == 0){
                    pairCounter++;
                }
            }
        }
        return pairCounter;
    }
}
