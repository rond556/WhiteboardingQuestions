import java.io.IOException;
import java.util.Arrays;

public class ArrayLeftRotation {

    //Rotate an array to the left by n spaces

    public Integer[] rotateLeft(Integer[] array, Integer numberOfSpaces) throws IOException {
        if(numberOfSpaces <= 0){
            throw new IOException("Number must be a positive integer");
        }
        Integer temp;
        for(int i = 0; i < numberOfSpaces; i++){
            temp = array[0];
            for(int j = 0; j < array.length - 1; j++){
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
        return array;
    }
}
