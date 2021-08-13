package pageModelFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignUpPage {
WebDriver driver;

@FindBy (xpath="//*[@id=\"id_gender1\"]") 
WebElement Mr;

@FindBy (xpath="//*[@id=\"id_gender2\"]")
WebElement Mrs;

@FindBy (xpath="//*[@id=\"customer_lastname\"]")
WebElement LastName;

@FindBy (xpath="//*[@id=\"days\"]")
WebElement Days;

@FindBy (xpath="//*[@id=\"months\"]")
WebElement Months;

@FindBy (xpath="//*[@id=\"years\"]")
WebElement years;

@FindBy (xpath="//*[@id=\"newsletter\"]")
WebElement CheckBoxNewsLetter;


public SignUpPage (WebDriver driver) { //class constructor
	this.driver=driver;
}

public String getMainPageTitle() {
	return driver.getTitle();
}

public void Mr () {
Mr.click();	
Mr.isSelected();
Assert.assertEquals(true, Mr.isSelected());
System.out.println("gender Male Assert Passed");
}

public void Mrs () {
Mrs.click();
Assert.assertEquals(true, Mrs.isSelected());
System.out.println("gender Female Assert Passed");
	
}
public void LastName (String lastname) {
LastName.sendKeys(lastname);	
Assert.assertEquals(true, LastName.getAttribute("value"));
System.out.println("---lastname Assert passed");
}

public void Days (int d) {
Days.click();
Select daysvalue=new Select(Days);
daysvalue.selectByIndex(0);
String Option=daysvalue.getFirstSelectedOption().getText();
Assert.assertEquals(d,Option);
System.out.println("-----Day is Selected!!");
}

public void Months (String m) {
Months.click();
Select monthsvalue=new Select (Months);
monthsvalue.selectByValue(m);
String Option=monthsvalue.getFirstSelectedOption().getText();
Assert.assertEquals(m,Option);
System.out.println("-----Month is Selected!!");
}

public void Years (String y) {
years.click();
Select yearsvalue=new Select (years);
yearsvalue.selectByValue(y);
String Option=yearsvalue.getFirstSelectedOption().getText();
Assert.assertEquals(y,Option);
System.out.println("-----Year is Selected!!");


	
}







}
