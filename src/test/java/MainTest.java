import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.reporters.jq.Main;

public class MainTest {
    @Test
    public void testlogin1(){
        Main myapp=new Main();
        Assert.assertEquals(0,myapp.user_Login("abc","abc123"));
    }

    @Test
    public void testlogin2(){
        Main myapp=new Main();
        Assert.assertEquals(1,myapp.user_Login("abc","abc@123"));
    }
}
