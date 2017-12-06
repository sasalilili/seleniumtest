package seleniumtest;



 
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;
  

public class Test {
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.gecko.driver","/Users/apple/Downloads/geckodriver");
	//	 System.setProperty("webdriver.firefox.bin","/Users/apple/Downloads/geckodriver");
	//	 System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox");
		  WebDriver driver=new FirefoxDriver(); 
	//	  WebDriver driver=new SafariDriver(); 
		 driver.navigate().to("http://cart.jumeicd.com");  
 
		// WebElement loginLink = driver.findElement(By.linkText("登录")); 
		 //loginLink.click();
		 //loginLink = driver.findElement(By.id("radio_normal"));
		 //loginLink.click();   

		 driver.manage().addCookie(new Cookie("account","b9dguoXzRE%2B2XdYPNsCvpZVrdRaf50XHDKb21uUa6pY6AlhwYqndLpr7c4efuGsCjozHX9klQxaTcNmMuZ3HWxX0xRQC5fzE6O36a5ESLvkx5e2mesO%2B5jehBOQVA0H3IOBLVgV7Piyt7%2BF6Lz7lKeUiQtVbHk7YjM6ITYI96HeP4kD2YaFNYJgtHbqAYUP1GSVqBopBtDKbgKtDB9GFXw%3D%3D"));
		 driver.manage().addCookie(new Cookie("tk","75c77130523c1c000ded5b5369cd8b14aa828504"));
		 driver.manage().addCookie(new Cookie("uid","2000012576"));
		 driver.manage().addCookie(new Cookie("v_uid","2000012576"));
		 driver.manage().addCookie(new Cookie("nickname","lisha003"));
		 driver.manage().addCookie(new Cookie("token","Hr0kWOP4y3UDpMDw9i65CdyjMvTg8lN6QrcHAIZquB3c2LVCQStXpLm7G8YKlexmqUaJgbw24ZRsnJffEzoOaFVnRXG0stEjYbKkA1xTNdiB97uS15FhWvIoPBDEHvED"));
		 driver.manage().addCookie(new Cookie("session","T4fQ1BcMXWSbAo5swgK9U8hJaEEXJXWD"));
		 driver.manage().addCookie(new Cookie("login_mode","pc_common_login"));
		 driver.manage().addCookie(new Cookie("privilege_group","0"));
		 driver.manage().addCookie(new Cookie("regidter_time","1512526682862"));
		 driver.manage().addCookie(new Cookie("_xsptplusUT_428","1"));
		 driver.manage().addCookie(new Cookie("_xsptplus428","428.49.1512526690.1512526720.4%234%7C%7C%7C%7C%7C%23%23P2zCm_0PNc2NYziKg174sHcZOAls1dTH%23"));
		 driver.manage().addCookie(new Cookie("ag_fid","FGJ4TNFqLjN1okFF"));
		 driver.get("http://cart.jumeicd.com/i/cart/new_items/1027429,,1");
		// WebElement yanzhengmaLink = driver.findElement(By.xpath("//*[@id=\"change_verify_code\"]/img"));
		// captureElement(yanzhengmaLink);
		} 
	
	 public static File captureElement(WebElement element) throws Exception {
	        // TODO Auto-generated method stub
	        WrapsDriver wrapsDriver = (WrapsDriver) element;
	        // 截图整个页面
	        File screen = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);

	        BufferedImage img = ImageIO.read(screen);
	        // 获得元素的高度和宽度
	        int width = element.getSize().getWidth();
	        int height = element.getSize().getHeight();
	        // 创建一个矩形使用上面的高度，和宽度
	        Rectangle rect = new Rectangle(width, height);
	        // 得到元素的坐标
            Point p = element.getLocation();
	        BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);
	        // 存为png格式
	        ImageIO.write(dest, "png", screen);	     
	        System.out.println(screen.getName()); 
	       String str =  ImagePreProcess3.getAllOcr(dest);
	       System.out.print(str);
	        return screen;
	    }
}
