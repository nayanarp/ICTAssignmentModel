import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class Execution {

    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;

    @Test(priority = 1)
    public void LoginTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report1.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("LoginTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        Login loginPage = new Login(driver);
        loginPage.Login("8075504249", "nayana");
        extentTest.log(Status.PASS, "Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();

    }

    @Test(priority = 2)
    public void LoginWrongCredentialsTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report2.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
       reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("LoginWrongCredentialsTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        LoginWrongCredentials LoginWrongCredentialsPage = new LoginWrongCredentials(driver);
        LoginWrongCredentialsPage.LoginWrongCredentials("807550429", "nayana");
        extentTest.log(Status.FAIL, "Login Fail");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 3)
    public void SearchItemMatchTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report3.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("SearchItemMatchTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        SearchItemMatch SearchItemMatchPage = new SearchItemMatch(driver);
        SearchItemMatchPage.SearchItemMatch("mobiles");
        extentTest.log(Status.PASS, "Search Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 4)
    public void AddingItemToCartTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report4.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("SearchItemMatchTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        AddingItemToCart AddingItemToCartPage = new AddingItemToCart(driver);
        AddingItemToCartPage.AddingItemToCart("8075504249", "nayana", "watches");
        extentTest.log(Status.PASS, "Adding Item To Cart");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 5)
    public void ExpensiveMobileTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report5.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("ExpensiveMobileTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        ExpensiveMobile ExpensiveMobilePage = new ExpensiveMobile(driver);
        ExpensiveMobilePage.ExpensiveMobile("8075504249", "nayana", "mobiles");
        extentTest.log(Status.PASS, "Expensive Mobile");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 6)
    public void PincodeNotAddedTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report6.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("PincodeNotAddedTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        PincodeNotAdded PincodeNotAddedPage = new PincodeNotAdded(driver);
        PincodeNotAddedPage.PincodeNotAdded("watches", "123456");
        extentTest.log(Status.PASS, "Pincode Not Added");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }
    @Test(priority = 7)
    public void PincodeWorksTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report7.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("PincodeWorksTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        PincodeWorks PincodeWorksPage = new PincodeWorks(driver);
        PincodeWorksPage.PincodeWorks("watches", "695024");
        extentTest.log(Status.PASS, "Pincode Works");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }


    @Test(priority = 8)
    public void FilterOptionsTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report8.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("PincodeWorksTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        FilterOptions FilterOptionsPage = new FilterOptions(driver);
        FilterOptionsPage.FilterOptions("watches");
        extentTest.log(Status.PASS, "Pincode Works");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }
    @Test(priority = 9)
    public void  RegisteredAddressTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report9.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("RegisteredAddressTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        RegisteredAddress RegisteredAddressPage = new RegisteredAddress(driver);
        RegisteredAddressPage.RegisteredAddress("watches");
        extentTest.log(Status.PASS, "Registered Address");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }
    @Test(priority = 10)
    public void  OfferZoneTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report10.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("RegisteredAddressTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        OfferZone OfferZonePage = new OfferZone(driver);
        OfferZonePage.OfferZone();
        extentTest.log(Status.PASS, "Registered Address");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 11)
    public void  AddItemToWishlistTest() throws IOException, InterruptedException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report11.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("AddItemToWishlistTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.flipkart.com");
        AddItemToWishlist AddItemToWishlistPage = new AddItemToWishlist(driver);
        AddItemToWishlistPage.AddItemToWishlist("8075504249","nayana","watches");
        extentTest.log(Status.PASS, "AddItem To Wishlist");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();

    }
}

