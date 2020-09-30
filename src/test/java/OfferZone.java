import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OfferZone {



    private WebDriver driver;



    private By CloseButton=By.xpath("/html/body/div[2]/div/div/button");
    private By oz=By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/a[2]");

    public OfferZone(WebDriver driver){
        this.driver=driver;
    }

    public void OfferZone() throws InterruptedException {
        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.elementToBeClickable(CloseButton)).click();
        Thread.sleep(1000);

        driver.findElement(oz).click();
        Thread.sleep(1000);
//        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        List<WebElement> h=driver.findElements(By.tagName("h2"));
        Thread.sleep(1000);
        for(WebElement h1:h)
        {
            Thread.sleep(1000);
            System.out.println(h1.getText());
            Thread.sleep(1000);
        }
    }
}
