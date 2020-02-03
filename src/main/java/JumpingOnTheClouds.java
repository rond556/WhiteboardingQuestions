import java.io.IOException;

public class JumpingOnTheClouds {

    /*
    Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are
    thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number
    of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take
    Emma to jump from her starting postion to the last cloud. It is always possible to win the game.

    For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided.
    For example,  indexed from . The number on each cloud is its index in the list so she must avoid the clouds at
    indexes  and . She could follow the following two paths:  or . The first path takes  jumps while the second takes .
    */

    public int numberOfJumps(int[] clouds) throws IOException {
        if(clouds.length == 0){
            throw new NullPointerException("Empty Array");
        }
        if(clouds[clouds.length - 1] == 1){
            throw new IOException("Final number of the array is 1");
        }
        for(int i = 0; i < clouds.length; i++){
            if(clouds[i] == 1 && clouds[i + 1] == 1){
                throw new IOException("Two 1's in a row can't be completed");
            }
        }



        int numberOfJumps = 0;
        for (int i = 0; i < clouds.length - 1; i++) {
            if (i + 2 != clouds.length) {
                if (clouds[i + 2] != 1) {
                    i++;
                    numberOfJumps++;
                } else {
                    numberOfJumps++;
                }
            } else {
                numberOfJumps++;
            }


        }
        return numberOfJumps;
    }
}
