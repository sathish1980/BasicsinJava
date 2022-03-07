package seleniumweekend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttestcase {
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32"
				+ "\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		//dr.get("https://en-gb.facebook.com/");
		dr.navigate().to("https://en-gb.facebook.com/");
		//dr.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firsttestcase f= new Firsttestcase();
		f.launch();
	}

}
