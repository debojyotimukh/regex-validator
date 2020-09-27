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
    public void emailTest(){

    }
}
