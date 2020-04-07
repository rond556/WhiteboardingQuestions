import java.util.*;
import java.util.regex.Pattern;

public class FireAndFury {

    public String fireAndFury(final String tweet) {
        if(!tweet.matches("[EFIRUY]+")){
            return "Fake tweet.";
        }
        ArrayList<String> fireFury = createString(tweet);
        if(fireFury.size() == 0){
            return "Fake tweet.";
        }
        if(fireFury.get(0).equals("FIRE") && fireFury.size() == 1){
            return "You are fired!";
        } else if (fireFury.get(0).equals("FURY") && fireFury.size() == 1) {
            return "I am furious.";
        }

        String current = fireFury.get(0);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < fireFury.size() - 1; i++){
            int counter = 0;
            for(int j = i; j <= fireFury.size(); j++){
                if(j != fireFury.size()) {
                    if (fireFury.get(j).equals(current)) {
                        counter++;
                    } else if (!fireFury.get(j).equals(current)) {
                        if (current.equals("FIRE")) {
                            sb.append(appendFire(counter));
                            current = "FURY";
                        } else if (current.equals("FURY")) {
                            sb.append(appendFury(counter));
                            current = "FIRE";
                        }
                        break;
                    }
                } else {
                    if (current.equals("FIRE")) {
                        sb.append(appendFire(counter));
                    } else if (current.equals("FURY")) {
                        sb.append(appendFury(counter));
                    }
                    break;
                }
            }
            if(!fireFury.contains("FIRE") || !fireFury.contains("FURY")){
                break;
            }
        }
        return sb.toString().trim();
    }

    public ArrayList<String> createString(String tweet){
        ArrayList<String> fireFury = new ArrayList<>();
        for(int i = 0; i < tweet.length() - 3; i++){
            if(tweet.substring(i, i + 4).equals("FURY")){
                fireFury.add("FURY");
            } else if (tweet.substring(i, i + 4).equals("FIRE")){
                fireFury.add("FIRE");
            }
        }
        return fireFury;
    }

    public String appendFire(int counter){
        if(counter == 1){
            return "You are fired! ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("You ");
        for(int i = 1; i < counter; i++){
            sb.append("and you ");
        }
        sb.append("are fired! ");

        return sb.toString();
    }

    public static String appendFury(int counter){
        if(counter == 1){
            return "I am furious. ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("I am ");
        for(int i = 1; i < counter; i++){
            sb.append("really ");
        }
        sb.append("furious. ");

        return sb.toString();
    }

}