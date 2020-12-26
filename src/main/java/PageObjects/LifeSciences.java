package PageObjects;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class LifeSciences {
    private final WebDriver driver;

    public LifeSciences(WebDriver driver) {
        this.driver = driver;
    }

    private Set<String> allTabs() {
        return driver.getWindowHandles();
    }

    private void switchToNewWindow() {
        driver.switchTo().window(getTheLastOpenedWindow());
    }

    private String getTheLastOpenedWindow() {
        String window = null;
        for (String s : allTabs()) {
            window = s;
        }
        return window;
    }

    public void verifyLink() {
        switchToNewWindow();
        assertEquals(driver.getCurrentUrl(), "https://www.epam.com/our-work/life-sciences");
    }
}