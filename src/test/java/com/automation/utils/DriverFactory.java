package com.automation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Utility class to manage WebDriver instances
public class DriverFactory {

    private static WebDriver driver; // Singleton WebDriver instance

    // Method to get a WebDriver instance
    public static WebDriver getDriver() {
        if (driver == null) { // If no driver exists, create a new one
            WebDriverManager.chromedriver().setup(); // Setup ChromeDriver using WebDriverManager
            driver = new ChromeDriver(); // Initialize ChromeDriver
        }
        return driver; // Return the driver instance
    }

    // Method to quit the WebDriver
    public static void quitDriver() {
        if (driver != null) { // If driver exists
            driver.quit(); // Close the browser
            driver = null; // Reset driver to null for future use
        }
    }
}
