import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean checkName(String name) {
        String pattern = "[A-Z][a-z]{2,}";
        return Pattern.matches(pattern, name);
    }

    public static boolean checkEmail(String email) {
        String pattern = "^[\\w-+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return Pattern.matches(pattern, email);
    }

    public static boolean checkMobile(String number) {
        String pattern = "[0-9]{2}+([ ])+([0-9]{10})";
        return Pattern.matches(pattern, number);
    }

    public static boolean checkPassword(String password) {
        if (password.length() < 8)
            return false;
        Matcher splChar = Pattern.compile("[^a-zA-Z0-9]").matcher(password);
        int splCharCount = 0;
        while (splChar.find())
            splCharCount++;
        return Pattern.matches(".*[A-Z].*", password) &&
                Pattern.matches(".*[0-9].*", password) &&
                (splCharCount == 1);
    }

    public static void main(String[] args) {
        checkEmail("abc.xyz@mnc.com");
        System.out.println(checkMobile("1A 8961749717"));
    }
}


