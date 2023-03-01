package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Given("Facebook login page is open")
	public void facebook_login_page_is_open() {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe"
		 * ); driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.facebook.com/");
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 */
		 
	System.out.println("step1");
	}

	@When("I enter the correct userid {string}")
	public void i_enter_the_correct_userid(String emailId) {
		//driver.findElement(By.id("email")).sendKeys(emailId);
	System.out.println("step2");
	}

	@When("I enter correct password {int}")
	public void i_enter_correct_password(Integer password) {
		//driver.findElement(By.id("pass")).sendKeys("123");
	System.out.println("step3");
	}

	@When("I click Login button")
	public void i_click_login_button() {
		//driver.findElement(By.xpath("//*[text()='Log in']")).click();
	System.out.println("step4");
	}

	@Then("Login Successfully")
	public void login_successfully() {
		System.out.println("step5");
		System.out.println("Login Successfully");
	}

}
