import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class UserRegistrationTest {
    @Test
    public void checkNameTest() {
        Assert.assertTrue(UserRegistration.checkName("Debojyoti"));

        Assert.assertFalse(UserRegistration.checkName("mi"));
        Assert.assertFalse(UserRegistration.checkName("D"));
        Assert.assertFalse(UserRegistration.checkName("debojyoti"));
    }

    @Test
    public void emailTestRunner() {
        Result result = JUnitCore.runClasses(EmailValidationTest.class);

        for (Failure failure : result.getFailures())
            System.out.println(failure.toString());
        System.out.println(result.wasSuccessful());
    }

    @Test
    public void mobileTestValid() {
        Assert.assertTrue(UserRegistration.checkMobile("91 9874311017"));
    }

    @Test
    public void mobileTestInvalid(){
        Assert.assertFalse(UserRegistration.checkMobile("91 98 74311017"));
        Assert.assertFalse(UserRegistration.checkMobile("919 874311017"));
        Assert.assertFalse(UserRegistration.checkMobile("A91 9874311017"));
        Assert.assertFalse(UserRegistration.checkMobile("91b9874311017"));
    }
}
