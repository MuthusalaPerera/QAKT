package com.automation.tests;

import com.automation.pages.GooglePage;
import com.automation.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// TestNG test class for Google Search functionality
public class GoogleTest {

    private WebDriver driver; // WebDriver instance
    private GooglePage googlePage; // GooglePage object

    // Setup method to run before each test
    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver(); // Get WebDriver from DriverFactory
        driver.get("https://www.google.com"); // Open Google homepage
        googlePage = new GooglePage(driver); // Initialize GooglePage object
    }

    // Test method to perform Google search
    @Test
    public void testGoogleSearch() {
        googlePage.search("Selenium Maven TestNG"); // Perform search
        System.out.println("Page title is: " + googlePage.getTitle()); // Print page title
    }

    // Teardown method to run after each test
    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver(); // Close browser and cleanup
    }
}
