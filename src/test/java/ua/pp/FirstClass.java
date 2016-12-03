package ua.pp;


        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Assert.*;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.firefox.FirefoxProfile;
        import org.openqa.selenium.firefox.internal.ProfilesIni;

        import java.util.concurrent.TimeUnit;


public class FirstClass {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {

        driver = new FirefoxDriver();

    }

    @Test
    public void gotoSeleniumWikiPage() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://en.wikipedia.org/");

        // Find the text input element by its id and type "Selenium"
        driver.findElement(By.id("searchInput")).sendKeys("Selenium");
//        // Click search button
        driver.findElement(By.id("searchButton")).click();
//        // Get text from header of the Selenium page
        String header = driver.findElement(By.id("firstHeading")).getText();
//        // Verify that header equals "Selenium"
        Assert.assertEquals(header, "Selenium");
    }

//    @Test // Marking this method as part of the test
//    public void gotoSeleniumWikiPageFailure() {
//        // Go to the Wikipedia home page
//        driver.get("https://en.wikipedia.org/");
//        // Find the text input element by its id and type "Selenium"
//        driver.findElement(By.id("searchInput")).sendKeys("Selenium");
//        // Click search button
//        driver.findElement(By.id("searchButton")).click();
//        // Get text from header of the Selenium page
//        String header = driver.findElement(By.id("firstHeading")).getText();
//        // Verify that header equals "Selenium WebDriver"
//        Assert.assertEquals(header, "Selenium WebDriver");
//    }

    @After // Runs this method after all the test methods in the current class have been run
    public void tearDown() throws Exception {
        // Close all browser windows and safely end the session
         driver.quit();
    }

}
