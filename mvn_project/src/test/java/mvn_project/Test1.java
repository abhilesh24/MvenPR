package mvn_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void a() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/6.0.1");
		driver.manage().window().maximize();
		System.out.println("hello");
		System.out.println("hello newbranch");
		System.out.println("hello childbranch");
	}
	
	
}
