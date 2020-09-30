import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class PincodeWorks {


    private WebDriver driver;

    private By search=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
    private By searchButton=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button");

    private By CloseButton=By.xpath("/html/body/div[2]/div/div/button");

    private By fitem=By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/div/a[1]");
    private By pin=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div[1]/div[1]/div/div[2]/input");
    private By check=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div[1]/div[1]/div/div[2]/span");
 By err=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div[1]/div[1]/div/div[2]/div/div/span");
    public PincodeWorks(WebDriver driver){
        this.driver=driver;
    }

    public void PincodeWorks(String product,String pincode) throws InterruptedException {
        driver.findElement(CloseButton).click();
        Thread.sleep(1000);
        driver.findElement(search).sendKeys(product);
        Thread.sleep(1000);
        driver.findElement(searchButton).click();
        Thread.sleep(2000);
        driver.findElement(fitem).click();
        Thread.sleep(2000);
        Set<String> wins = driver.getWindowHandles();
        for (String w : wins) {
            driver.switchTo().window(w);
        }
        Thread.sleep(3000);
        driver.findElement(pin).sendKeys(pincode);
        Thread.sleep(2000);
        driver.findElement(check).click();
        Thread.sleep(2000);
        Thread.sleep(2000);

    }
}
