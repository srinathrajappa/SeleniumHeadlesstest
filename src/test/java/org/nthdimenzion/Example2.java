package org.nthdimenzion;

/**
 * Created by Srinath on 20-Mar-15.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Example2  {
    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver(); //1

        // And now use this to visit Google
        driver.get("http://www.google.com"); //2

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q")); //3

        // Enter something to search for
        element.sendKeys("Cheese!"); //4

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit(); //5

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
    }
}
