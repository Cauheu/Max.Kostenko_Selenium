package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EpamPage {
    private final WebDriver driver;
    private final By searchIcon = By.xpath("//button[@class='header-search__button header__icon']");
    private final By RPAOption = By.xpath("//li[@class='frequent-searches__item' and contains(text(), 'RPA')]");
    private final By findButton = By.xpath("//button[@class='header-search__submit']");
    private final By LinkedInLink = By.xpath("//a[@class='footer__social-link' and @href='https://www.linkedin.com/company/epam-systems/']");
    private final By careerLink = By.xpath("//a[@class='top-navigation__item-link and @href='/careers']");
    private final By blogLink = By.xpath("//a[@class='top-navigation__main-link' and @href='/careers/blog']");
    private final By serviceLink = By.xpath("//a[@class='top-navigation__item-link' and @href='/services']");
    private final By ourworkLink = By.xpath("//a[@class='top-navigation__item-link' and @href='/our-work']");
    private final By insightsLink = By.xpath("//a[@class='top-navigation__item-link' and @href='/insights']");
    private final By navMenu = By.xpath("//nav[@class='top-navigation-ui']");
    private final By twitterLink = By.xpath("//a[@class='footer__social-link' and contains(@href, 'https://twitter.com/')]");
    private final By servicesLink = By.xpath("//a[@class='top-navigation__item-link' and @href='/services']");
    private final By consulting = By.xpath("//a[@class='top-navigation__epam-continuum-featured-link feature-item']");
    private final By contactUs = By.xpath("//a[@class='cta-button-ui cta-button--envelope header__control']");
    private final By designLink = By.xpath("//a[@class='rollover-tiles__link' and @href='/services/consult-and-design']");
    private final By lifesciencesLink = By.xpath("//a[@class='top-navigation__main-link and @href='/our-work/life-sciences']");
    
    public EpamPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement searchIcon() {
        return driver.findElement(searchIcon);
    }

    private WebElement RPAOption() {
        return driver.findElement(RPAOption);
    }

    private WebElement findButton() {
        return driver.findElement(findButton);
    }

    private WebElement LinkedInLink() {
        return driver.findElement(LinkedInLink);
    }
    
    private WebElement LifeSciencesLink() {
        return driver.findElement(lifesciencesLink);
    }

    private WebElement DesignLink() {
        return driver.findElement(designLink);
    }
    
    private WebElement careerLink() {
        return driver.findElement(careerLink);
    }

    private WebElement blogLink() {
        return driver.findElement(blogLink);
    }
    
    private WebElement OurWorkLink() {
        return driver.findElement(ourworkLink);
    }


    private WebElement serviceLink() {
        return driver.findElement(serviceLink);
    }

    private WebElement navMenu() {
        return driver.findElement(navMenu);
    }

    private WebElement twitterLink() {
        return driver.findElement(twitterLink);
    }

    private WebElement servicesLink() {
        return driver.findElement(servicesLink);
    }

    private WebElement consulting() {
        return driver.findElement(consulting);
    }

    private WebElement contactUs() {
        return driver.findElement(contactUs);
    }
    
    private WebElement Insights() {
        return driver.findElement(insightsLink);
    }

    public void clickSearchIcon() {
        searchIcon().click();
    }
    
    public void clickLifeSciencesLink() {
    	LifeSciencesLink().click();
    }
    
    public void selectRPAOption() {
        RPAOption().click();
    }

    public void clickFindButton() {
        findButton().click();
    }
    public void clickDesignLink() {
    	DesignLink().click();
    }
    
    public void clickInsightsLink() {
    	Insights().click();
    }

    public void clickLinkedInLink() {
        LinkedInLink().click();
    }

    public void moveToCareer() {
        Actions actions = new Actions(driver);
        actions.moveToElement(careerLink()).build().perform();
    }

    public void clickBlogLink() {
        blogLink().click();
    }

    public void clickServiceLink() {
        serviceLink().click();
    }

    public void clickOurWorkLink() {
        OurWorkLink().click();
    }
    
    public void clickNavMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(navMenu()).build().perform();
    }

    public void clickTwitterLink() {
        twitterLink().click();
    }

    public void moveToServices() {
        Actions actions = new Actions(driver);
        actions.moveToElement(servicesLink()).build().perform();
    }

    public void clickContactUs() {
        contactUs().click();
    }

    public void clickConsultingLink() {
        consulting().click();
    }
}
