package String.StringBuffer;

import java.util.Random;

public class RandomString {
    static String generate(int size) {
        StringBuffer sb = new StringBuffer(size);
        Random r = new Random();

        for(int i = 0; i < 26; i++){
            int randomChar = 97 + (int)(r.nextFloat() *26);
            sb.append((char)randomChar);
        }
        return sb.toString();

    }
    
}
