import java.util.HashMap;

public class RansomNote {
    /*
    Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his
    handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an
    untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words
    available in the magazine. He cannot use substrings or concatenation to create the words he needs.

    Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note
    exactly using whole words from the magazine; otherwise, print No.

    For example, the note is "Attack at dawn". The magazine contains only "attack at dawn". The magazine has all the
    right words, but there's a case mismatch. The answer is .
     */

    public Boolean matchTheNotWithMagazineClip(String[] magazine, String[] note){
        if(note.length == 0 || magazine.length == 0){
            throw new NullPointerException("String arrays are empty");
        }
        if(note.length > magazine.length){
            return false;
        }
        HashMap<String, Integer> magazineCounter = new HashMap<>();
        HashMap<String, Integer> noteCounter = new HashMap<>();

        for(String s :magazine){
            if(!magazineCounter.containsKey(s)){
                magazineCounter.put(s,1);
            } else {
                magazineCounter.put(s,magazineCounter.get(s) + 1);
            }
        }
        for(String s : note){
            if(!noteCounter.containsKey(s)){
                noteCounter.put(s,1);
            } else {
                noteCounter.put(s,noteCounter.get(s) + 1);
            }
            if(!magazineCounter.containsKey(s)){
                magazineCounter.put(s,0);
            }
        }

        for(String s : note){
            if(!magazineCounter.get(s).equals(noteCounter.get(s))){
                return false;
            }
        }


        return true;
    }
}
