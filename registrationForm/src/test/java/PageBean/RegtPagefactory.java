package PageBean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegtPagefactory {
WebDriver driver;


@FindBy(name="userid")
@CacheLookup
WebElement pfuserid;

@FindBy(name="passid")
@CacheLookup
WebElement pfpass;

@FindBy(name="username")
@CacheLookup
WebElement pfuname;

@FindBy(name="address")
@CacheLookup
WebElement pfadd;

@FindBy(how=How.NAME, using="country")
@CacheLookup
WebElement pfcountry;

@FindBy(name="zip")
@CacheLookup
WebElement pfzip;

@FindBy(name="email")
@CacheLookup
WebElement pfeamil;


@FindBy(name="sex")
@CacheLookup
WebElement pfsex;

@FindBy(name = "en")
@CacheLookup
WebElement pfen;

@FindBy(name = "nonen")
@CacheLookup
WebElement pfnonen;

/*@FindBy(xpath=".//*[@id='desc']")
@CacheLookup
WebElement pfabout;*/

@FindBy(name = "submit")
@CacheLookup
WebElement pfsubmit;
	
	public WebElement getPfuserid() {
	return pfuserid;
}

public void setPfuserid(String suserid) {
	pfuserid.sendKeys(suserid);
}

public WebElement getPfpass() {
	return pfpass;
}

public void setPfpass(String spass) {
	pfpass.sendKeys(spass);
}

public WebElement getPfuname() {
	return pfuname;
}

public void setPfuname(String suname) {
	pfuname.sendKeys(suname);
}

public WebElement getPfadd() {
	return pfadd;
}

public void setPfadd(String sadd) {
	pfadd.sendKeys(sadd);
}

public WebElement getPfcountry() {
	return pfcountry;
}

public void setPfcountry(String scountry) {
	Select drpCity = new Select(pfcountry);
	drpCity.selectByVisibleText(scountry);

}

public WebElement getPfzip() {
	return pfzip;
}

public void setPfzip(String szip) {
	pfzip.sendKeys(szip);
}

public WebElement getPfeamil() {
	return pfeamil;
}

public void setPfeamil(String seamil) {
	pfeamil.sendKeys(seamil);
}

public WebElement getPfsex() {
	return pfsex;
}

public void setPfsex(String ssex) {
	this.pfsex=driver.findElement(By.cssSelector(ssex));
	pfsex.click();
	
}

public WebElement getPfen() {
	return pfen;
}

public void setPfen(String sen) {
	this.pfen=driver.findElement(By.cssSelector(sen));
	pfen.click();
}

public WebElement getPfnonen() {
	return pfnonen;
}

public void setPfnonen(String snonen) {
	this.pfnonen=driver.findElement(By.cssSelector(snonen));
	pfnonen.click();
}

/*public WebElement getPfabout() {
	return pfabout;
}

public void setPfabout(WebElement pfabout) {
	this.pfabout = pfabout;
}*/

public WebElement getPfsubmit() {
	return pfsubmit;
}

public void setPfsubmit() {
	pfsubmit.click();
}

	public RegtPagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
