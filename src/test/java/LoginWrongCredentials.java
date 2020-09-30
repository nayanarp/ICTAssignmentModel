import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWrongCredentials {

    private WebDriver driver;

    private By txtUserName=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
    private By txtcontinue=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span");
    private By txtPassword=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
    private By txtstartshop=By.xpath("//div[@class='box-margin']/child::input");
    public LoginWrongCredentials(WebDriver driver){
        this.driver=driver;
    }

    public void LoginWrongCredentials(String username, String password) throws InterruptedException {

        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
        Thread.sleep(1000);
        driver.findElement(txtUserName).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(txtPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(txtcontinue).click();
        Thread.sleep(2000);



    }

}
