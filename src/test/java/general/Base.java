package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; // objeto do Selenium webDriver
    // ^ - ao usar PageFactory mudar de public para protected

    // v - criar um contrutor e inicializar os elementos Pagefactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
