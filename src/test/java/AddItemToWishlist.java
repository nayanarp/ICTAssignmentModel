import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class AddItemToWishlist {


    private WebDriver driver;
    private By txtUserName=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
    private By txtcontinue=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span");
    private By txtPassword=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
    private By txtstartshop=By.xpath("//div[@class='box-margin']/child::input");
    private By q=By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[6]/div/div[2]/div[1]/div/div/input");
    private By q1=By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[5]/div/div[2]/div[1]/div/button[2]");
    private By addCart=By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
    private By item=By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/a[1]");

    private By search=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
    private By searchButton=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button");

    private By CloseButton=By.xpath("/html/body/div[2]/div/div/button");
    private By wish=By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/div[2]/div/svg/path");
    public AddItemToWishlist(WebDriver driver){
        this.driver=driver;
    }

    public void AddItemToWishlist(String username, String password,String product) throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
        Thread.sleep(1000);
        driver.findElement(txtUserName).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(txtPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(txtcontinue).click();
        Thread.sleep(1000);
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        Thread.sleep(1000);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(search));
        Thread.sleep(1000);
        driver.findElement(search).sendKeys(product);
        Thread.sleep(1000);
        driver.findElement(searchButton).click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(item)).click();

        Thread.sleep(1000);
        Set<String> wins = driver.getWindowHandles();
        for (String w : wins) {
            driver.switchTo().window(w);
        }
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(wish)).click();
        Thread.sleep(2000);

    }
}
