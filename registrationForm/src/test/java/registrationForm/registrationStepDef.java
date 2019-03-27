package registrationForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageBean.RegtPagefactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class registrationStepDef {
	private WebDriver driver;
	private RegtPagefactory object;
	@Given("^User is on registration page\\.$")
	public void user_is_on_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  object=new  RegtPagefactory (driver);
		  driver.get("file://ndafile/GLC-G102/BDD%20MPT%20HTML%20files/set%20A/WebPages/RegistrationForm.html");
	}

	@Then("^check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
		 String title=driver.getTitle();
		   if(title.contentEquals("Welcome to JobsWorld"))
			   System.out.println("Title matched");
		   else
			   System.out.println("title not matched");
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   driver.close();
		  
	}

	@Then("^enter invalid credential\\.$")
public void enter_invalid_credential() throws Throwable {
		object.setPfuserid("");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("12545");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("121");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
}

@When("^Navigate to registration page again\\.$")
public void navigate_to_registration_page_again() throws Throwable {
   
}

	@When("^user leaves userid blank$")
	public void user_leaves_userid_blank() throws Throwable {
		object.setPfuserid("");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("indai");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("English");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@When("^clicks the button$")
	public void clicks_the_button() throws Throwable {
		object.setPfsubmit();
	}

	@Then("^display the alert msg$")
	public void display_the_alert_msg() throws Throwable {
		 String alertMsg=driver.switchTo().alert().getText();
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
		   System.out.println("****"+alertMsg);
		   driver.close();
	}

	@When("^user leaves password blank$")
	public void user_leaves_password_blank() throws Throwable {
		object.setPfuserid("kul");
		  Thread.sleep(1000);
		  object.setPfpass("");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("indai");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("English");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@When("^user leaves name blank$")
	public void user_leaves_name_blank() throws Throwable {
		object.setPfuserid("kul");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("indai");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("English");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@When("^user leaves address blank$")
	public void user_leaves_address_blank() throws Throwable {
		object.setPfuserid("kul");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("");
		  Thread.sleep(1000);
		  object.setPfcountry("indai");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("English");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@When("^user leaves country blank$")
	public void user_leaves_country_blank() throws Throwable {
		object.setPfuserid("kul");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("English");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@When("^user leaves zipcode blank$")
	public void user_leaves_zipcode_blank() throws Throwable {
		object.setPfuserid("kul");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("indai");
		  Thread.sleep(1000);
		  object.setPfzip("");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("English");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@When("^user leaves emailid blank$")
	public void user_leaves_emailid_blank() throws Throwable {
		object.setPfuserid("kul");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("indai");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("English");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@When("^user leaves sex blank$")
	public void user_leaves_sex_blank() throws Throwable {
		object.setPfuserid("kul");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("indai");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("");
		  Thread.sleep(1000);
		  object.setPfen("English");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@When("^user leaves language blank$")
	public void user_leaves_language_blank() throws Throwable {
		object.setPfuserid("kul");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("indai");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		object.setPfuserid("kul");
		  Thread.sleep(1000);
		  object.setPfpass("123");
		  Thread.sleep(1000);
		  object.setPfuname("kuldeep");
		  Thread.sleep(1000);
		  object.setPfadd("kosi");
		  Thread.sleep(1000);
		  object.setPfcountry("indai");
		  Thread.sleep(1000);
		  object.setPfzip("281406");
		  Thread.sleep(1000);
		  object.setPfeamil("ksinghchauhan");
		  Thread.sleep(1000);
		  object.setPfsex("male");
		  Thread.sleep(1000);
		  object.setPfen("English");
		  Thread.sleep(1000);
		  object.setPfsubmit();
		  Thread.sleep(1000);
		  driver.close();
	}

	@Then("^naviagate to success page$")
	public void naviagate_to_success_page() throws Throwable {
		driver.navigate().to("file://ndafile/GLC-G102/BDD/Selenium/success.html");
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  driver.close();
	}

}
