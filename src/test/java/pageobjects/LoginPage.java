package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id="checkBoxOption2")
            WebElement checkbox;

   @FindBy(id="dropdown-class-example")
    WebElement dropdown;

    @FindBy(xpath="//input[@value='radio1']")
    WebElement radiobtn;


    @FindBy(id="name")
    WebElement roundbtn;


    @FindBy(id="alertbtn")
    WebElement alertbtn;


public void setUp()
{
    checkbox.click();
}
    public void selectDropdown()
    {
       dropdown.click();
        Select s = new Select(dropdown);
        s.selectByIndex(1);
    }


public void selectButtons() throws InterruptedException {
    radiobtn.click();
    roundbtn.sendKeys("usha");
    Thread.sleep(2000);
    alertbtn.click();
    driver.switchTo().alert().accept();
}












}
