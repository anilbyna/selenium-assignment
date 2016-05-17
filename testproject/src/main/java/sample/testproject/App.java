package sample.testproject;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//VerifyYahooTitle
public class App {
    
    // Declare the Webdriver as Instance varaible 
    private WebDriver driver;
    
    // This our Expected Tittle(Result)
    private String expectedTittle = "Yahoo";
    
    
    @BeforeTest  // This is TestNG annotaion
    public void invokeBrowser(){
        
    	System.out.println("invokeBrowser()");
    	
        // This selenium code
        // Invoking the firefox browser 
        driver = new FirefoxDriver();    
    }
    
    @Test
    public void verifyTittle(){
    	System.out.println("verifyTitle()");
    	
    	//Open the website 
        driver.get("https://in.yahoo.com/");
        
        // Get the actual title using selenium code
        String actualTittle = driver.getTitle();
        
        /*
         * Verify the page title using by comparision 
         * of Actual and Expected Title
        */
        
        Assert.assertEquals(expectedTittle, actualTittle);
    }
    
    // Close the browser after complete the Test
    @AfterTest
    public void closeBrowser(){
    	System.out.println("closeBrowser()");
        driver.close();
    }

}
 


