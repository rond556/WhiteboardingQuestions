import java.io.IOException;

public class KanagrooJumps {

    /*
    You have two kanagroos jumping along a linear path
    One starts at position n and moves at a speed of x-mph
    One starts at position m and moves at a speed of y-mph

    Write a function that returns a boolean as to whether or not they will ever land on the same spot
     */

    public Boolean willTheyMeet(int xPosition, int xSpeed, int yPosition, int ySpeed) throws IOException {
        if(xSpeed <= 0 || ySpeed <= 0){
            throw new IOException("Speed must be a positive integer");
        }
        while(xPosition != yPosition){
            xPosition += xSpeed;
            yPosition += ySpeed;
            if((xSpeed > ySpeed && xPosition > yPosition) || (ySpeed > xSpeed && yPosition > xPosition)){
                return false;
            }
        }
        return true;
    }
}
