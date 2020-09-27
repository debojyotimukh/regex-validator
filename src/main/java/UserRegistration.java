import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean checkName(String name){
        String pattern="[A-Z][a-z]{2,}";
        Pattern pt=Pattern.compile(pattern);
        return pt.matcher(name).matches();
    }

    public static boolean checkEmail(String email){
        String[] strings=email.split(".,@");
        return false;
    }

}
