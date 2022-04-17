package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
     openBrowser(baseUrl);

    }
    @Test

    // userShouldNavigateToForgotPasswordPageSuccessfully
    public void  userShouldNavigateToForgotPasswordPageSuccessfully(){

        // Verify the text ‘Forgot Your Password?’
        String expectedMessage = "Forgot your password?";

        // String actualMessage = driver.findElement(By.xpath("//h1[@class='Forgot Your Password?']")).getText();
        String actualMessage = driver.findElement(By.xpath("//a[@href = '/index.php/auth/requestPasswordResetCode']")).getText();
        System.out.println("actual msg = "+ actualMessage );
        //String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Can not verify Forgot Your Pasword Message : ", expectedMessage, actualMessage);
        // Click on ‘Forgot your password’ link
        //find ‘Forgot your password’ link and click on ‘Forgot your password’ link
        WebElement forgotPassLink = driver.findElement(By.xpath("//a[text() = 'Forgot your password?']"));
        forgotPassLink .click();


    }
}
