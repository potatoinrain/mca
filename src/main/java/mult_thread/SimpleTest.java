package mult_thread;

import java.util.regex.Pattern;

public class SimpleTest {

    public static void main(String[] args) {
        String content = "165dd$23,.";

        String pattern = "^[a-zA-Z0-9$!-_,.]{5,12}$";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);
    }
    
}
