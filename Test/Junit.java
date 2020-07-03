import Controller.LoginController;
import org.junit.Assert;
import org.junit.Test;

public class Junit {
    @Test
    public void test1(){
        LoginController l = new LoginController();
        Assert.assertFalse(l.checkCredentials("haha", "haha"));
    }
}
