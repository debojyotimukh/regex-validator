import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void checkNameTest(){
        Assert.assertTrue(UserRegistration.checkName("Debojyoti"));

        Assert.assertFalse(UserRegistration.checkName("mi"));
        Assert.assertFalse(UserRegistration.checkName("D"));
        Assert.assertFalse(UserRegistration.checkName("debojyoti"));
    }

    @Test
    public void emailTestValid(){
        Assert.assertTrue(UserRegistration.checkEmail("abc@yahoo.com"));
        Assert.assertTrue(UserRegistration.checkEmail("abc-100@yahoo.com"));
        Assert.assertTrue(UserRegistration.checkEmail("abc.100@yahoo.com"));
        Assert.assertTrue(UserRegistration.checkEmail("abc111@abc.com"));
        Assert.assertTrue(UserRegistration.checkEmail("abc-100@abc.net"));
        Assert.assertTrue(UserRegistration.checkEmail("abc.100@abc.com.au"));
        Assert.assertTrue(UserRegistration.checkEmail("abc@1.com"));
        Assert.assertTrue(UserRegistration.checkEmail("abc@gmail.com.com"));
        Assert.assertTrue(UserRegistration.checkEmail("abc+100@gmail.com"));

    }

    @Test
    public void emailTestInvalid(){
        //tld can not start with dot
        Assert.assertFalse(UserRegistration.checkEmail("abc@.com.my"));
        // .a is not a valid tld, last tld must contains at least two  characters
        Assert.assertFalse(UserRegistration.checkEmail("abc123@gmail.a"));
        //tld can not start with dot
        Assert.assertFalse(UserRegistration.checkEmail("abc123@.com"));
        Assert.assertFalse(UserRegistration.checkEmail("abc123@.com.com"));

        //email’s 1st character can not start with dot
        Assert.assertFalse(UserRegistration.checkEmail(".abc@abc.com"));
        //email’s is only allow character, digit, underscore and dash
        Assert.assertFalse(UserRegistration.checkEmail("abc()*@gmail.com"));
        //email’s tld is only allow character and digit
        Assert.assertFalse(UserRegistration.checkEmail("abc@%*.com"));
        //double dots are not allowed
        Assert.assertFalse(UserRegistration.checkEmail("abc..2002@gmail.com"));
        //email’s last character can not end with dot
        Assert.assertFalse(UserRegistration.checkEmail("abc.@gmail.com"));
        //double @ is not allowed
        Assert.assertFalse(UserRegistration.checkEmail("abc@abc@gmail.com"));
        //email’s tld which has two characters can not contains digit
        Assert.assertFalse(UserRegistration.checkEmail("abc@gmail.com.1a"));

    }
    @Test
    public void emailTestMultipleTld(){
        //cannot have multiple tld
        Assert.assertFalse(UserRegistration.checkEmail("abc@gmail.com.aa.au"));
    }
}
