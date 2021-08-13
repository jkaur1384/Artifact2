package testModel1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseModel.Setup;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageModelBy.SignInPage;

public class SignInTestCase extends Setup {
	
	SignInPage Obj1;	
	

@Test (priority=0, invocationCount=3)
public void SignUpPage_appears () {
	Obj1=new SignInPage (driver);
	Obj1.OpenSignInForm("jsmith6784@yahoo.com");
	
	
}

}
