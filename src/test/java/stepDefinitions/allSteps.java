package stepDefinitions;

import PageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
public class allSteps {
    static WebDriver driver;
    static EpamPage epamPage;

    @Given("we have https:\\/\\/www.epam.com\\/ open")
    public void weHaveHttpsWwwEpamComOpen() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.epam.com/");
    }

    @When("click search button")
    public void clickSearchButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickSearchIcon();
    }

    @When("search for RPA")
    public void searchForRPA() {
        epamPage = new EpamPage(driver);
        epamPage.selectRPAOption();
        epamPage.clickFindButton();
    }

    @Then("we have search results for RPA")
    public void weHaveSearchResultsForRPA() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.verifySuccessSearching();
        driver.quit();
    }

    @When("click LinkedIN button")
    public void clickLinkedInButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickLinkedInLink();
    }

    @Then("we have https:\\/\\/www.linkedin.com\\/company\\/epam-systems\\/ open")
    public void weHaveHttpsWwwLinkedInOpen() {
    	LinkedInPage linkedinPage = new LinkedInPage(driver);
    	linkedinPage.verifyLink();
        driver.quit();
    }

    @When("click our work button")
    public void clickOurWorkButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickNavMenu();
        epamPage.clickOurWorkLink();
        
    }

    @Then("we have https:\\\\/\\\\/www.epam.com\\\\/our-work open")
    public void weHaveOurWorkOpen() {
    	OurWork ourworkPage = new OurWork(driver);
    	ourworkPage.verifyLink();
        driver.quit();
    }
    
    @When("click click on insights")
    public void clickInsightsButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickNavMenu();
        epamPage.clickInsightsLink();
        
    }

    @Then("we have https:\\\\/\\\\/www.epam.com\\\\/insights open")
    public void weHaveInsightsOpen() {
    	Insights insightsPage = new Insights(driver);
    	insightsPage.verifyLink();
        driver.quit();
    }
    

    
    
    @When("we click on Design button")
    public void clickDesignButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickDesignLink();
        
    }

    @Then("we have https:\\\\/\\\\/www.epam.com\\\\/services\\\\/consult-and-design open")
    public void weHaveDesignOpen() {
    	Design designPage = new Design(driver);
    	designPage.verifyLink();
        driver.quit();
    }
    

    @When("we click on our work Life Sciences button")
    public void weClickOnExploreOurLatestWorkLSButton() {
    	epamPage = new EpamPage(driver);
        epamPage.clickNavMenu();
        epamPage.clickLifeSciencesLink();
    }

    @Then("we have https:\\\\/\\\\/www.epam.com\\\\/our-work\\\\/life-sciences open")
    public void weSeeInfoLifeSciencesWork() {
    	LifeSciences lifesciences = new LifeSciences(driver);
        lifesciences.verifyLink();
        driver.quit();
    }
    

    @When("we click on blog button")
    public void weClickOnBlogButton() {
        epamPage = new EpamPage(driver);
        epamPage.moveToCareer();
        epamPage.clickBlogLink();
    }

    @Then("we have blog article open")
    public void weHaveBlogArticleOpen() {
        BlogPage blogPage = new BlogPage(driver);
        blogPage.verifyPageIsOpened();
        driver.quit();
    }

    @When("we click on menu button")
    public void weClickOnMenuButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickNavMenu();
    }

    @When("we click on service button")
    public void weClickOnServiceButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickServiceLink();
    }

    @Then("we have https:\\/\\/www.epam.com\\\\/service open")
    public void weHaveHttpsWwwEpamComServiceOpen() {
        Service servicePage = new Service(driver);
        servicePage.verifyPageIsOpened();
        driver.quit();
    }

    
}
