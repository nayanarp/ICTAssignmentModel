import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class RegisteredAddress {

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
    private By hl=By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[4]");
    private By CloseButton=By.xpath("/html/body/div[2]/div/div/button");

    private By first=By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]");
    private By add=By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[6]/div/div[2]/div/div");

    public  RegisteredAddress(WebDriver driver){
        this.driver=driver;
    }

    public void  RegisteredAddress(String product) throws InterruptedException {

        driver.findElement(CloseButton).click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(4000);
        System.out.println(driver.findElement(add).getText());
        Thread.sleep(1000);
         Assert.assertEquals(driver.findElement(add).getText(),"Flipkart Internet Private Limited,\n" +
                 "Buildings Alyssa, Begonia &\n" +
                 "Clove Embassy Tech Village,\n" +
                 "Outer Ring Road, Devarabeesanahalli Village,\n" +
                 "Bengaluru, 560103,\n" +
                 "Karnataka, India\n" +
                 "CIN : U51109KA2012PTC066107\n" +
                 "Telephone: 1800 208 9898");
    }
}
