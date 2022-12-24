package testDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import qaobject.RegisterObject;

public class testQA {
	public WebDriver driver;
	public RegisterObject ro;

	@Given("Open Browser {string}")
	public void open_browser(String url) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","./src/test/java/utilities/chromedriver.exe");
	    driver = new ChromeDriver();
	    ro =new RegisterObject(driver);
	    driver.get(url);
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	}

	@Given("Click on MyAccount")
	public void click_on_my_account() throws InterruptedException {
        ro.myAccount();

	}

	@When("Click on Register")
	public void click_on_register() {
	   ro.registerBtn();
	}

	@Then("Give FirstName and LastName")
	public void give_first_name_and_last_name() {
	   ro.first_Name("sivakumar","appovu");
	  
	}

	@Then("Give Email")
	public void give_email() {
	    ro.email("appovugari77@gmail.com");
	}
	
	@Then("Give Telephone_Number")
	public void give_telephone_number() {
       ro.telephone("6543678976");
	}
	
	

	@Then("Give Password and conform_Password")
	public void give_password_and_conform_password() {
	    ro.password("siva#123");
	    ro.con_password("siva#123");
	}

	@Then("Select Subscribe")
	public void select_subscribe() {
	   ro.yesRadio();
	}

	@Then("Select Agree_Box")
	public void select_agree_box() {
	  ro.agreeBtn();
	}

	@Then("Click_Continue")
	public void click_continue() {
	    ro.register();
	}
	
	 /* @Then("Compare_Success {actual}")
	public void compare_Success(String actual) {
		ro.compare(actual);
		
	} */
	
	

}
