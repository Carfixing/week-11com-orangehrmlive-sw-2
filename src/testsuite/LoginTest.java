package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*userSholdLoginSuccessfullyWithValidCredentials
        * Enter “Admin” username
        * Enter “admin123 password
        * Click on ‘LOGIN’ button
        * Verify the ‘Welcome’ text is display*/

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){

        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //enter valid username
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        //sending email to email field element
        userNameField.sendKeys("Admin");

        //enter valid password
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        //sending password to password field element
        passwordField.sendKeys("admin123");

        // Click on ‘LOGIN’ button
        //find log in Button and click on login Button
        WebElement loginButton = driver.findElement(By.name("Submit"));
        loginButton.click();

        // Verify the ‘Welcome’ text is display
        String expectedMessage = "Welcome Paul";

        String actualMessage = driver.findElement(By.id("welcome")).getText();
        //String actualMessage = actualMessageElement.getText();
      //  Assert.assertEquals("can not verify welcome Message : ",expectedMessage,actualMessage);
         Assert.assertTrue("Test fail",actualMessage.contains("Paul"));
        if(actualMessage.contains("Welcome")){
            System.out.println("test pass");
        }else{
            System.out.println("Test fail");
        }
        //Assert.assertEquals("Can not verify welcome Message : ", expectedMessage, actualMessage);

    }
}
