package qaobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class RegisterObject {
	
	 WebDriver driver;

	 public RegisterObject(WebDriver driver){
         this.driver=driver;
  	PageFactory.initElements(driver, this);
  }
	
	 
	@FindBy(how = How.XPATH, using="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myAccountTab;
	
	@FindBy(how = How.LINK_TEXT,using= "Register")
    WebElement registerbtn;
    
    @FindBy(how = How.ID, using = "input-firstname")
    WebElement firstName;
    
    @FindBy(how = How.ID,using = "input-lastname")
    WebElement lastName;
    
    
    @FindBy(how = How.ID,using = "input-email")
    WebElement email;
    
    @FindBy(how = How.ID,using = "input-telephone")
    WebElement telephoneNo;
    
    @FindBy(how = How.ID,using = "input-password")
    WebElement password;

    @FindBy(how = How.ID,using = "input-confirm")
    WebElement conform_password;
    
    @FindBy(how=How.XPATH, using="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
    WebElement yesRadio;
    
    @FindBy(how=How.XPATH, using="//*[@id=\"content\"]/form/div/div/input[1]")
    WebElement agreeBox;
    
    @FindBy(how=How.XPATH, using="//input[@type='submit']")
    WebElement continuebtn;
    
   
    public void myAccount() {
         myAccountTab.click();
    }
    
    public void registerBtn() {
    	registerbtn.click();
    }
    
    public void first_Name(String fnameP,String lnameP) {
    	firstName.sendKeys(fnameP);
    	lastName.sendKeys(lnameP);
    }
    
   
    public void email(String emailP) {
    	email.sendKeys(emailP);
    }
    
    public void telephone(String tele_NoP) {
    	telephoneNo.sendKeys(tele_NoP);
    }
    
    public void password(String passP) {
    	password.sendKeys(passP);
    }
    
    public void con_password(String cpassP) {
    	conform_password.sendKeys(cpassP);
    }
    
    public void yesRadio() {
    	yesRadio.click();
    } 
    
    public void agreeBtn() {
    	agreeBox.click();
    } 
    
    public void register() {
    	continuebtn.click();
    }
    
    /*public void compare(String actual) {
    	String page_content = driver.getPageSource();
    	if(page_content.contains(actual)) {
    		System.out.println("Registered Sucessfully");
    		
    	}
    } */
}

