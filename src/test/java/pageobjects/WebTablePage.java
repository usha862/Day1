package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablePage {

WebDriver driver;
public WebTablePage(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver,this);

}

@FindBy(css=".tableFixHead td:nth-child(4)")
List<WebElement> values;


public void setTablepage() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)");
    Thread.sleep(3000);
    js.executeScript("document.querySelector('.tableFixHead').scrollTop =5000");
}

public void countPage() {
    int sum = 0;
    for (int i = 0; i < values.size(); i++) {
        sum = sum + Integer.parseInt(values.get(i).getText());
    }
    System.out.println(sum);


}


}

