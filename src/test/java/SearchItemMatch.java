import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchItemMatch {

    private WebDriver driver;

    private By search=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
    private By searchButton=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button");

    private By CloseButton=By.xpath("/html/body/div[2]/div/div/button");

    public SearchItemMatch(WebDriver driver){
        this.driver=driver;
    }

    public void SearchItemMatch(String product) throws InterruptedException {
        driver.findElement(CloseButton).click();
        Thread.sleep(1000);
        driver.findElement(search).sendKeys(product);
        Thread.sleep(1000);
        driver.findElement(searchButton).click();
        Thread.sleep(2000);

    }
}
