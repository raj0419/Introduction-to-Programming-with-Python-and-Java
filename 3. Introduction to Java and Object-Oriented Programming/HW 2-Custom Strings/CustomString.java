import static org.junit.jupiter.api.Assertions.assertEquals;
import java.nio.charset.CharsetEncoder;
import java.util.*;

public class CustomString {
    String myString;
    boolean isSet;
    public CustomString() {
        this.myString = null;
        this.isSet = false;
    }
    public String getString() {
        return this.myString;
    }
    public void setString(String string) {
        if (string == null) {
            this.isSet = false;
        }

        this.isSet = true;
        this.myString = string;
    }
    public String remove(String arg) {
        if (this.myString != null) {
            String regex = "(?i)["+ arg + "]";
            String filtered = this.myString.replaceAll(regex, "");

            return filtered;
        } else {
            return "";
        }
    }
    public String reverse(String arg) {
        if (this.myString == null || this.myString == "") {
            return "";
        } else {
            String myNewString = "";

            for (char c: this.myString.toCharArray()) {
                char currentChar = c;

                for (char a: arg.toCharArray()) {
                    if (Character.toLowerCase(a) == Character.toLowerCase(c)) {
                        currentChar = Character.isUpperCase(c) ?
                                Character.toLowerCase(c) : Character.toUpperCase(c);
                    }
                }

                myNewString += currentChar;
            }

            return myNewString;
        }
    }
    public String filterLetters(char n, boolean more) {
        if (this.myString == null) {
            return "";
        } else {
            String myNewString = "";

            for (int i = 0; i < this.myString.length(); i++) {
                if (more) {
                    if (Character.toLowerCase(this.myString.charAt(i)) >= n && this.myString.charAt(i) != ' ') {
                        myNewString += "";
                    } else {
                        myNewString += this.myString.charAt(i);
                    }
                } else {
                    if (Character.toLowerCase(this.myString.charAt(i)) <= n && this.myString.charAt(i) != ' ') {
                        myNewString += "";
                    } else {
                        myNewString += this.myString.charAt(i);
                    }
                }
            }

            return myNewString;
        }
    }
}