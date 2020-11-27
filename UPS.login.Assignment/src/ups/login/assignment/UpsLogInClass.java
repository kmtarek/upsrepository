package ups.login.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpsLogInClass {

	public static void main(String[] args) {
		
		
		WebDriver chromedriver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
			
		chromedriver.get("https://www.ups.com/doapp/signup");
		chromedriver.manage().window().maximize();
		chromedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Cookies ????
		WebElement Cookies = chromedriver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/button/span[1]"));
		Cookies.click();
		
		//Confirm from where ????
		//WebElement Confirm = chromedriver.findElement(By.id("preferences_prompt_submit"));
		//Confirm.click();
		
		WebElement Name = chromedriver.findElement(By.xpath("//*[@id=\"ups-full_name_input\"]"));
		Name.sendKeys("K M Tarek");
		
		WebElement Email = chromedriver.findElement(By.xpath("//*[@id=\"ups-email_input\"]"));
		Email.sendKeys("abc@gmail.com");
		
		WebElement userID = chromedriver.findElement(By.xpath("//*[@id=\"ups-user_id_input\"]"));
		userID.sendKeys("1234567");
		
		
		WebElement password = chromedriver.findElement(By.xpath("//*[@id=\"ups-user_password_input\"]"));
		password.sendKeys("@123$");
		
		Select country = new Select (chromedriver.findElement(By.xpath("//*[@id=\"main\"]/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[3]/div/div[1]/div/select")));
		country.selectByVisibleText(" Bangladesh +880 ");
		
		
		WebElement phoneNumber = chromedriver.findElement(By.xpath("//*[@id=\"ups-phone_input\"]"));
		phoneNumber.sendKeys("571343");
		
		WebElement checkBox = chromedriver.findElement(By.xpath("//*[@id=\"ups-checkbox_group\"]/div/label"));
		checkBox.click();
		
		WebElement signup = chromedriver.findElement(By.xpath("//*[@id=\"main\"]/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[4]/div[3]/div/button"));
		signup.click();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
