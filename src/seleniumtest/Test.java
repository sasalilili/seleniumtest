package seleniumtest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test {
	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","/Users/apple/Downloads/geckodriver");
	//	 System.setProperty("webdriver.firefox.bin","/Users/apple/Downloads/geckodriver");
	//	 System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox");
		  WebDriver driver=new FirefoxDriver(); 
	//	  WebDriver driver=new SafariDriver(); 
			driver.navigate().to("http://cart.jumeicd.com");
			} 
}
