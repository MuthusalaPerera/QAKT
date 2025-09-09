package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Page Object Model class for Google Search page
public class GooglePage {

    private WebDriver driver; // WebDriver instance for browser interactions
    private By searchBox = By.name("q"); // Locator for Google search input box

    // Constructor to initialize the WebDriver
    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to perform a search on Google
    public void search(String text) {
        WebElement box = driver.findElement(searchBox); // Find the search box element
        box.sendKeys(text); // Type the search query
        box.submit(); // Submit the search (like pressing Enter)
    }

    // Method to get the page title
    public String getTitle() {
        return driver.getTitle(); // Returns the current page title
    }
}
