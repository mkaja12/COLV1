package com.COLeCommerceWebsite.stepDefinitions;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.COLeCommerceWebsite.pageObjects.BaseClass;
import com.COLeCommerceWebsite.pageObjects.LoginPageObjects;
import com.COLeCommerceWebsite.utilities.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions extends BaseClass{
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		
	 /*   ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\kungfupanda01-main\\COL V1.0\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);   */
		

	   System.setProperty("webdriver.chrome.driver", "D:\\kungfupanda01-main\\COL V1.0\\Drivers\\chromedriver.exe");
	   // options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();    

	    
	    lp= new LoginPageObjects(driver);
	    //wh.waitForPageLoad(1000);
	    driver.manage().window().maximize();
	}

	@Given("User Launch Edge browser")
	public void user_launch_edge_browser() throws InterruptedException {
	    System.setProperty("webdriver.edge.driver", "D:\\kungfupanda01-main\\COL V1.0\\Drivers\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    
	    
	    lp= new LoginPageObjects(driver);
	    driver.manage().window().maximize();
	}
	
	@Given("User Launch Firefox browser")
	public void user_launch_firefox_browser() throws InterruptedException {
	    System.setProperty("webdriver.gecko.driver", "D:\\kungfupanda01-main\\COL V1.0\\Drivers\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    
	    
	    lp= new LoginPageObjects(driver);
	    driver.manage().window().maximize();
	}
	
	
	
	@When("User Opens {string}")
	public void User_Opens (String URL) {
		
		try {

			driver.get(URL);
			
		} catch (Exception e) {
			System.out.println("Unable to Launch the URL");
	}
	}

	@When("User enters {string}")
	public void user_enters(String USERID) {
		
		try {
			lp.enterAmazonUserID(USERID);
		} catch (Exception e) {
			System.out.println("Unable to enter USER ID");
		}
	}

	@When("Click on Continue button")
	public void click_on_continue_button() {
		
		try {
			lp.clickAmazonContinueButton();
		} catch (Exception e) {
			System.out.println("Unable to click on CONTINUE BUTTON");
		}
			
	}

	@Then("Sign In Page {string} should be validated")
	public void sign_in_page_should_be_validated(String TITLE) {
		
		try {
			lp.titleValidateAmazonPasswordButton(TITLE);
		} catch (Exception e) {
			System.out.println("Unable to validate Sign in Page through Title of page");
		}
			
	}

	@And ("User clicks Amazon Logo link and validated {string}")
	public void user_clicks_amazon_logo_link_and_validated (String page) throws Exception{
		
		try {
			lp.validateAmazonLogoPage(page);
		} catch (Exception e) {
			System.out.println("Unable to click on Amazon logo");
		}
			
	}
	
	@When("User validated  {string}")
	public void user_validated(String page1) {
		
		try {
			lp.validateAmazonHelpLink2(page1);
		} catch (Exception e) {
			System.out.println("Unable to validate Amazon Help link2");
		}
			
	}
    
    @And ("User clicks HelpLink2")
    public void user_clicks_helplink2 (){
    	
    	try {
    		lp.clickAmazonHelpLink2();
		} catch (Exception e) {
			System.out.println("Unable to click on Amazon Help link2");
		}
    		
    }

    @When("User clicks on Accept and Continue button on the pop up")
    public void user_clicks_on_accept_and_continue_button_on_the_pop_up() {
    	try {
    		lp.clickPopUpAccept();
    		
    		
		} catch (Exception e) {
			System.out.println("No Pop up available");
		}  
    }

  /*  @When("User clicks on Courses button")
    public void user_clicks_on_courses_button() {
    	try {
    		lp.clickOnCourses();
		} catch (Exception e) {
			System.out.println("Unable to click on Courses");
		} 
    }
*/
    @When("User clicks on View Single Courses button")
    public void user_clicks_on_view_single_courses_button() {
    	try {
    		lp.clickOnViewSingleCourses();
    		//ss.takeSnapShot(driver, "D:\\kungfupanda01-main\\COL V1.0\\target");
		} catch (Exception e) {
			System.out.println("Unable to click on View Single Courses");
		} 

    }

    @When("User clicks on Add to cart button")
    public void user_clicks_on_add_to_cart_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Continue to Checkout button")
    public void user_clicks_on_continue_to_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Create Account button")
    public void user_clicks_on_create_account_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Personal email address radio button")
    public void user_clicks_on_personal_email_address_radio_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects {string} from drop down")
    public void user_selects_from_drop_down(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Continue button")
    public void user_clicks_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects Terms and Conditions radio button")
    public void user_selects_terms_and_conditions_radio_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Pay now")
    public void user_clicks_on_pay_now() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User navigated Order confirmation Page")
    public void user_navigated_order_confirmation_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Store Payment ID")
    public void store_payment_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Store Reference ID")
    public void store_reference_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Store Course ID")
    public void store_course_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Store Course Name")
    public void store_course_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Store Total amount")
    public void store_total_amount() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Store GST amount")
    public void store_gst_amount() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
	
	@And("Close the browser")
	public void close_the_browser() {
			lp.closeBrowser();
	}

}
