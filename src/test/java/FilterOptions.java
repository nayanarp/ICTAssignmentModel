import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterOptions {

    private WebDriver driver;
    private By txtUserName=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
    private By txtcontinue=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span");
    private By txtPassword=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
    private By txtstartshop=By.xpath("//div[@class='box-margin']/child::input");
    private By q=By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[6]/div/div[2]/div[1]/div/div/input");
    private By q1=By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[5]/div/div[2]/div[1]/div/button[2]");
    private By addCart=By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
    private By item=By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/a[1]");
    //private By item=By.linkText("Realme C3 (Frozen Blue, 32 GB)");
    private By search=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
    private By searchButton=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button");
    private By hl=By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[4]");
    private By CloseButton=By.xpath("/html/body/div[2]/div/div/button");

    private By first=By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]");
    public FilterOptions(WebDriver driver){
        this.driver=driver;
    }

    public void FilterOptions(String product) throws InterruptedException {

        driver.findElement(CloseButton).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        Thread.sleep(1000);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(search));
        Thread.sleep(1000);
        driver.findElement(search).sendKeys(product);
        Thread.sleep(1000);
        driver.findElement(searchButton).click();
        Thread.sleep(5000);
        driver.findElement(hl).click();
        Thread.sleep(4000);
    }
}
