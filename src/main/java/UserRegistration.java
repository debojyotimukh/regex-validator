import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean checkName(String name){
        String pattern="[A-Z][a-z]{2,}";
        Pattern pt=Pattern.compile(pattern);
        return pt.matcher(name).matches();
    }

    public static boolean checkEmail(String email){
        String pattern="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return Pattern.compile(pattern).matcher(email).matches();
    }

    public static boolean checkMobile(String number){
        String pattern="[0-9]{2}+([ ])+([0-9]{10})";
        return Pattern.compile(pattern).matcher(number).matches();
    }

    public static void main(String[] args) {
        checkEmail("abc.xyz@mnc.com");
        System.out.println(checkMobile("1A 8961749717"));
    }
}


